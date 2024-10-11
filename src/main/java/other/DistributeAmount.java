package other;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class DistributeAmount {
    public static void main(String[] args) {
        double totalAmount = 100.0;
        int numberOfPeople = 3;
        double[] distributedAmounts = distributeAmount(totalAmount, numberOfPeople);

        System.out.println("分配结果: " + Arrays.toString(distributedAmounts));
    }

    /**
     * 四舍五入+多轮平均
     *
     * @param totalAmount
     * @param numberOfPeople
     * @return
     */
    public static double[] distributeAmount(double totalAmount, int numberOfPeople) {
        double[] result = new double[numberOfPeople];
        BigDecimal remainingAmount = BigDecimal.valueOf(totalAmount);

        // 分配每个人的金额
        for (int i = 0; i < numberOfPeople - 1; i++) {
            /**
             * UP：向远离零的方向舍入。正数则为向上舍入，负数则为向下舍入。
             * DOWN：向靠近零的方向舍入。正数则为向下舍入，负数则为向上舍入。
             * CEILING：向正无穷大的方向舍入。
             * FLOOR：向负无穷大的方向舍入。
             * HALF_UP：向离零最近的方向舍入，如果两个方向离零的距离相等，则选择远离零的方向。
             * HALF_DOWN：向离零最近的方向舍入，如果两个方向离零的距离相等，则选择靠近零的方向。
             * HALF_EVEN：向离零最近的方向舍入，如果两个方向离零的距离相等，则选择偶数方向。
             * UNNECESSARY：如果使用UNNECESSARY模式进行舍入时，一定要确保舍入操作不会导致精度丢失，否则会抛出异常。
             */
            BigDecimal share = remainingAmount.divide(BigDecimal.valueOf(numberOfPeople - i), 2, RoundingMode.CEILING);
            System.out.println("share = " + share);
            result[i] = share.doubleValue();
            remainingAmount = remainingAmount.subtract(share);
            System.out.println("i = " + i + ",share = " + share + ",remainingAmount = " + remainingAmount);

        }

        // 最后一人的金额等于剩余金额
        result[numberOfPeople - 1] = remainingAmount.doubleValue();
        return result;
    }
}
