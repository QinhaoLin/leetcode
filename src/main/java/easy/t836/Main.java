package easy.t836;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-08 14:19
 */
public class Main {
    public static void main(String[] args) {
        // true
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        System.out.println("new Main().isRectangleOverlap() = " + new Main().isRectangleOverlap(rec1, rec2));
    }

    /**
     * ����һ�£����������ƽ���з���һ���̶��ľ��� rec2����ô���� rec1 ����Ҫ������ rec2 �ġ����ܡ���
     * Ҳ����˵������ rec1 ��Ҫ����������������е�����һ�֣�
     * ���� rec1 �ھ��� rec2 ����ࣻ
     * ���� rec1 �ھ��� rec2 ���Ҳࣻ
     * ���� rec1 �ھ��� rec2 ���Ϸ���
     * ���� rec1 �ھ��� rec2 ���·���
     *
     * @param rec1
     * @param rec2
     * @return
     */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||   // left
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2] ||   // right
                rec1[1] >= rec2[3]);    // top
    }

    /**
     * ˼·
     * ������������ص�����ô�����ص�������һ��Ҳ��һ�����Σ���ô����������������� xx ��ƽ�еıߣ�ˮƽ�ߣ�ͶӰ�� xx ����ʱ���н�����
     * �� yy ��ƽ�еıߣ���ֱ�ߣ�ͶӰ�� yy ����ʱҲ���н�������ˣ����ǿ��Խ����⿴��һά�߶��Ƿ��н��������⡣
     * <p>
     * <p>
     * �㷨
     * ���� rec1 �� rec2 ��ˮƽ��ͶӰ�� xx ���ϵ��߶ηֱ�Ϊ (rec1[0], rec1[2]) �� (rec2[0], rec2[2])��
     * ������ѧ֪ʶ���ǿ���֪������ min(rec1[2], rec2[2]) > max(rec1[0], rec2[0]) ʱ���������߶��н�����
     * ���ھ��� rec1 �� rec2 ����ֱ��ͶӰ�� yy ���ϵ��߶Σ�ͬ����Եõ����� min(rec1[3], rec2[3]) > max(rec1[1], rec2[1]) ʱ���������߶��н�����
     *
     * @param rec1
     * @param rec2
     * @return
     */
    public boolean isRectangleOverlap2(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) &&
                Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));
    }
}
