package easy.t1013;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-11 14:31
 */
public class Main {
    public static void main(String[] args) {
        int[] test = {1, -1, 1, -1, 1, -1, 1, -1};
        // int[] test = {0, 2, 2};
        System.out.println("new Main().canThreePartsEqualSum(test) = " + new Main().canThreePartsEqualSum(test));
    }

    public boolean canThreePartsEqualSum(int[] A) {
        final int count = 3;
        if (A == null || A.length < count) {
            return false;
        }

        int sum = 0;
        for (int num : A) {
            sum += num;
        }

        // 判断总和是否能被 count 整除
        if (sum % count != 0) {
            return false;
        }

        // 遍历数组累加，每累加到目标值 cnt 加1，表示又找到1段,
        // 找到2段后就返回true（i 只能到数组 A 的倒数第二个元素，保证了有第3段）
        sum /= 3;
        int curSum = 0, cnt = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum == sum) {
                cnt++;
                curSum = 0;
            }
        }
        // flag不一定等于3，例如[1,-1,1,-1,1,-1,1,-1]
        return cnt >= 3;
    }
}
