package medium.t34;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-15 12:44
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10, 10, 10};
        int target = 8;
        System.out.println("new Main().searchRange(nums, target) = " + Arrays.toString(new Main().searchRange(nums, target)));
    }

    /**
     * ����һ�������������е��������� nums����һ��Ŀ��ֵ target���ҳ�����Ŀ��ֵ�������еĿ�ʼλ�úͽ���λ�á�
     * ����㷨ʱ�临�Ӷȱ����� O(log n) ����
     * ��������в�����Ŀ��ֵ������[-1, -1]��
     * <p>
     * ʾ�� 1:
     * ����: nums = [5,7,7,8,8,10], target = 8
     * ���: [3,4]
     * <p>
     * ʾ�� 2:
     * ����: nums = [5,7,7,8,8,10], target = 6
     * ���: [-1,-1]
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        } else {
            int last = findFirst(nums, target + 1) - 1;
            return new int[]{first, last};
        }
    }

    /**
     * ���� target ������ nums ���״γ��ֵ�λ��
     *
     * @param nums
     * @param target
     * @return
     */
    private int findFirst(int[] nums, int target) {
        int left = 0;
        // ע�� right �ĳ�ʼֵ
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // �����λ�����ڵ���Ŀ��ֵ����˵���������������
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
