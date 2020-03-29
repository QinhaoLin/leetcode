package hard.t42;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-24 10:04
 */
public class Main {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("new Main().trap() = " + new Main().trap3(height));
    }

    /**
     * dp
     * 1. �������������飬max_left [i] ����� i �������ߵ�ǽ�ĸ߶ȣ�max_right[i] ����� i ���ұ���ߵ�ǽ�ĸ߶ȡ�
     * 2. ��ȡ�����ÿ�е��������ߵ����߶Ⱥ��ٱ���һ�飬��ȡ����ڵ�ǰ�е��������ǽ����͸߶ȣ�
     * �����ǰ�и߶ȵ��ڴ�ǽ�ĸ߶ȣ����ô�ǽ�ĸ߶ȼ�ȥ��ǰ�и߶Ⱦ��ǵ�ǰ�еĽ��ֵ��
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int sum = 0;
        // ����ڵ�ǰ�������ߵ�ǽ
        int[] max_left = new int[height.length];
        // ����ڵ�ǰ���ұ��Ըߵ�ǽ
        int[] max_right = new int[height.length];

        for (int i = 1; i < height.length - 1; i++) {
            max_left[i] = Math.max(max_left[i - 1], height[i - 1]);
        }
        for (int i = height.length - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }

    /**
     * dp-�Ż���ȥ�� max_left ����
     * ����ͬʱ�� max_right ������ȥ������Ϊ���� for ѭ���Ǵ����ұ����ģ��� max_right �ĸ����Ǵ�������ġ�
     *
     * @param height
     * @return
     */
    public int trap2(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int sum = 0;
        // ����ڵ�ǰ�������ߵ�ǽ
        int max_left = 0;
        // ����ڵ�ǰ���ұ��Ըߵ�ǽ
        int[] max_right = new int[height.length];

        for (int i = height.length - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            // ���ұ����Ĺ��̣���¼��ߵ����߶�
            max_left = Math.max(max_left, height[i - 1]);
            int min = Math.min(max_left, max_right[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }

    /**
     * ˫ָ��
     * ͬʱ�� max_left��max_right ����ȥ����������ָ�룬left �� right������������ȥ������
     * max_left = Math.max(max_left, height[i - 1]);
     * height [ left - 1] �ǿ��ܳ�Ϊ max_left �ı�����
     * ͬ��height [ right + 1 ] �ǿ��ܳ�Ϊ right_max �ı�����
     * <p>
     * ֻҪ��֤ height [ left - 1 ] < height [ right + 1 ] ����ô max_left ��һ��С�� max_right��
     * ��Ϊ max_left ���� height [ left - 1] ���¹����ģ��� height [ left - 1 ] ��С�� height [ right + 1] �ģ�
     * �� height [ right + 1 ] ����� max_right�����Լ�ӵĵó� max_left һ��С�� max_right��
     * ��֮�����Ǿʹ��ҵ������
     *
     * @param height
     * @return
     */
    public int trap3(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int sum = 0;
        int max_left = 0;
        int max_right = 0;
        // ��ָ��
        int left = 0 + 1;
        // ��ָ��
        int right = height.length - 1 - 1;
        while (left <= right) {
            // �����Ҹ�
            if (height[left - 1] < height[right + 1]) {
                max_left = Math.max(max_left, height[left - 1]);
                int min = max_left;
                if (min > height[left]) {
                    sum = sum + (min - height[left]);
                }
                left++;
            } else { // ���ҵ����
                max_right = Math.max(max_right, height[right + 1]);
                int min = max_right;
                if (min > height[right]) {
                    sum = sum + (min - height[right]);
                }
                right--;
            }
        }
        return sum;
    }
}
