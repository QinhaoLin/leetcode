package showmebug;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.StampedLock;

public class T5647 {
    public static void main(String[] args) {

    }

    private final Map<String, AtomicInteger> productMap = new HashMap<>();
    private final StampedLock lock = new StampedLock();


    /**
     * 添加新的商品和库存量。如果商品 ID 已经存在，应该更新库存量。
     *
     * @param productId
     * @param amount
     */
    public void addProduct(String productId, int amount) throws InvalidStockException {
        long stamp = lock.writeLock();
        try {
            AtomicInteger stock = productMap.computeIfAbsent(productId, k -> new AtomicInteger(0));
            int newAmount = stock.addAndGet(amount);
            if (newAmount < 0) {
                throw new InvalidStockException("Invalid stock amount: " + newAmount);
            }
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    /**
     * 销售商品。如果库存不足，应抛出库存不足异常。
     *
     * @param productId
     * @param amount
     */
    public void sellProduct(String productId, int amount) throws InvalidStockException, InsufficientStockException {
        long stamp = lock.writeLock();
        try {
            if (amount < 0) {
                throw new InvalidStockException("Invalid stock amount: " + amount);
            }
            AtomicInteger stock = productMap.computeIfAbsent(productId, k -> new AtomicInteger(0));
            int currentAmount = stock.get();
            if (currentAmount < amount) {
                throw new InsufficientStockException("Insufficient stock for product: " + productId);
            }
            int newAmount = currentAmount - amount;
            stock.set(newAmount);
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    /**
     * 获取商品 ID 所对应的商品的库存。
     *
     * @param productId
     * @return
     */
    public int getAmount(String productId) {
        long stamp = lock.readLock();
        try {
            AtomicInteger stock = productMap.getOrDefault(productId, new AtomicInteger(0));
            return stock.get();
        } finally {
            lock.unlockRead(stamp);
        }
    }


    class InsufficientStockException extends Exception {
        public InsufficientStockException(String message) {
            super(message);
        }
    }

    class InvalidStockException extends Exception {
        public InvalidStockException(String message) {
            super(message);
        }
    }
}
