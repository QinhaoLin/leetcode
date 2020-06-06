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

        // �ж��ܺ��Ƿ��ܱ� count ����
        if (sum % count != 0) {
            return false;
        }

        // ���������ۼӣ�ÿ�ۼӵ�Ŀ��ֵ cnt ��1����ʾ���ҵ�1��,
        // �ҵ�2�κ�ͷ���true��i ֻ�ܵ����� A �ĵ����ڶ���Ԫ�أ���֤���е�3�Σ�
        sum /= 3;
        int curSum = 0, cnt = 0;
        for (int i = 0; i < A.length; i++) {
            curSum += A[i];
            if (curSum == sum) {
                cnt++;
                curSum = 0;
            }
        }
        // flag��һ������3������[1,-1,1,-1,1,-1,1,-1]
        return cnt >= 3;
    }
}
