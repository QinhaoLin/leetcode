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
     * 想象一下，如果我们在平面中放置一个固定的矩形 rec2，那么矩形 rec1 必须要出现在 rec2 的「四周」，
     * 也就是说，矩形 rec1 需要满足以下四种情况中的至少一种：
     * 矩形 rec1 在矩形 rec2 的左侧；
     * 矩形 rec1 在矩形 rec2 的右侧；
     * 矩形 rec1 在矩形 rec2 的上方；
     * 矩形 rec1 在矩形 rec2 的下方。
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
     * 思路
     * 如果两个矩形重叠，那么它们重叠的区域一定也是一个矩形，那么这代表了两个矩形与 xx 轴平行的边（水平边）投影到 xx 轴上时会有交集，
     * 与 yy 轴平行的边（竖直边）投影到 yy 轴上时也会有交集。因此，我们可以将问题看作一维线段是否有交集的问题。
     * <p>
     * <p>
     * 算法
     * 矩形 rec1 和 rec2 的水平边投影到 xx 轴上的线段分别为 (rec1[0], rec1[2]) 和 (rec2[0], rec2[2])。
     * 根据数学知识我们可以知道，当 min(rec1[2], rec2[2]) > max(rec1[0], rec2[0]) 时，这两条线段有交集。
     * 对于矩形 rec1 和 rec2 的竖直边投影到 yy 轴上的线段，同理可以得到，当 min(rec1[3], rec2[3]) > max(rec1[1], rec2[1]) 时，这两条线段有交集。
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
