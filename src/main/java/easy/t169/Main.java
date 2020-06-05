package easy.t169;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-05 14:09
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println("new Main().majorityElement() = " + new Main().majorityElement(nums));
    }

    /**
     * Ħ��ͶƱ����
     * �ӵ�һ������ʼcount=1��������ͬ�ľͼ�1��������ͬ�ľͼ�1������0�����»�������ʼ�����������ҵ������Ǹ�
     * <p>
     * ���ľ��Ƕ�ƴ���ġ�
     * ��һ��������Ե���Ϸ�������㷽�˿ڳ������˿�һ�����ϣ������ܱ�֤ÿ���˿ڳ�ȥ���̶���һ��һͬ���ھ���������˻������Ĺ��Ҿ���ʤ����
     * �Ǿʹ��ս�£���������˶����������Ը��㣨��Ӧ��ÿ��ѡ����Ϊ����������������������
     * ������������Ҳ���໥��������ѡ����������Ϊ������������������ֻҪ���ǲ�Ҫ�ڶ������϶���Ӯ��
     * �����ʣ�µıض����Լ��ˡ�
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (res == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    res = nums[i + 1];
                }
            }
        }
        return res;
    }
}
