package showmebug.t5651;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Java 并发银行转账系统与转账记录
 */
public class T5651 {
    public static void main(String[] args) {

    }

    private final Map<LocalDateTime, Transfer> transferMap = new ConcurrentHashMap<>();

    public void transfer(Account fromAccount, Account toAccount, double amount) throws InterruptedException {
        while (true) {
            if (fromAccount.getLock().tryLock()) {
                try {
                    if (toAccount.getLock().tryLock()) {
                        try {
                            if (fromAccount.getBalance() < amount) {
                                return;
                            } else {
                                fromAccount.debit(amount);
                                toAccount.credit(amount);
                                Transfer transfer = new Transfer(fromAccount, toAccount, amount);
                                transferMap.put(transfer.getTime(), transfer);
                                return;
                            }
                        } finally {
                            toAccount.getLock().unlock();
                        }
                    }
                } finally {
                    fromAccount.getLock().unlock();
                }
            }
            // 避免 cpu 空转
            Thread.sleep(10);
        }
    }


    public Map<LocalDateTime, Transfer> getTransferMap() {
        return transferMap;
    }
}

class Transfer {
    private Account fromAccount;
    private Account toAccount;
    private double amount;
    private LocalDateTime time;

    public Transfer(Account fromAccount, Account toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTime() {
        return time;
    }
}

