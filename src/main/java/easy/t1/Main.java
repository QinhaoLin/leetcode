package easy.t1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-10 14:32
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        System.out.println("new Main().twoSum(nums,target) = " + Arrays.toString(new Main().twoSum(nums, target)));
    }

    /**
     * ��ϣ��
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        // ���� hash ��ϵ��Ӧ
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                indexs[0] = map.get(nums[i]);
                indexs[1] = i;
            }
            // �����ݴ��룬key Ϊ������value Ϊ�±�
            map.put(target - nums[i], i);
        }
        return indexs;
    }

}
