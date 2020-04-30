package medium.t11;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-30 14:23
 */
public class Main {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("new Main().maxArea() = " + new Main().maxArea(height));
    }

    public int maxArea(int[] height) {
        // ��ָ��
        int left = 0;
        // ��ָ��
        int right = height.length - 1;
        // ���ؽ��
        int res = 0;
        while (left < right) {
            // ʢˮ�� = ����ָ��-��ָ�룩 *  ��͸߶�
            // ÿ�α���ȡ���Ž�����ƶ�����ֵС��ָ��
            if (height[left] < height[right]) {
                // ��ָ����ǰ�ƶ�
                res = Math.max(res, (right - left) * height[left++]);
            } else {
                // ��ָ�������ƶ�
                res = Math.max(res, (right - left) * height[right--]);
            }
        }
        return res;
    }
}

