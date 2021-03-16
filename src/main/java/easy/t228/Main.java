package easy.t228;

import java.util.ArrayList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-16 15:54
 */
public class Main {
    /**
     * ���⣺ �����������зֳ����������ļ��Σ���ÿ�ΰ���ָ����ʽд�����б�
     * ʾ����
     * ���룺nums = [0, 1, 2, 4, 5, 7]
     * �����["0->2", "4->5", "7"]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> list = new Main().summaryRanges(nums);
        System.out.println(list.toString());
    }

    /**
     * ������ ʹ�� ˫ָ�룬i ָ��ÿ���������ʼλ�ã�j �� i ��ʼ������ֱ�������������������� j �ﵽ����߽磩��
     * ��ǰ���������Ȼ�� i ָ�����Ϊ j + 1����Ϊ��һ������Ŀ�ʼλ�ã�j ��������������һ������Ľ���λ�ã�
     * ���ѭ����ֱ���������������ϡ�
     *
     * @param nums
     * @return
     */
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        // i ��ʼָ��� 1 ���������ʼλ��
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // j ��������ֱ����������������(�� nums[j] + 1 != nums[j + 1])
            // ���� j �ﵽ����߽磬��ǰ������������ [i, j] ������ϣ�����д�����б�
            if (j + 1 == nums.length || nums[j] + 1 != nums[j + 1]) {
                // ����ǰ���� [i, j] д�����б�
                StringBuilder sb = new StringBuilder();
                sb.append(nums[i]);
                if (i != j) {
                    sb.append("->").append(nums[j]);
                }
                res.add(sb.toString());
                // �� i ָ�����Ϊ j + 1����Ϊ��һ���������ʼλ��
                i = j + 1;
            }
        }
        return res;
    }
}
