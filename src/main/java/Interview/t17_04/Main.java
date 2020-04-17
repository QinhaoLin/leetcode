package Interview.t17_04;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-16 19:35
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1};
        System.out.println("new Main().missingNumber() = " + new Main().missingNumber(nums));
    }

    /**
     * & ��λͬʱΪ��1���������Ϊ��1��������Ϊ0
     * | ��λ��ֻҪ��һ��Ϊ��1���������Ϊ��1��
     * ^ �����λֵ��ͬ����ý��Ϊ��1��������Ϊ��0��
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= i;
            sum ^= nums[i];
        }
        sum ^= nums.length;
        return sum;
    }

    public int missingNumber2(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            n ^= i ^ nums[i];
        }
        return n;
    }
}
