package easy.t492;

import java.util.Arrays;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-13 10:29
 */
public class Main {
    public static void main(String[] args) {
        int area = 4;
        System.out.println("new Main().constructRectangle() = " + Arrays.toString(new Main().constructRectangle(area)));
    }

    /**
     * 1. 你设计的矩形页面必须等于给定的目标面积。
     * 2. 宽度 W 不应大于长度 L，换言之，要求 L >= W 。
     * 3. 长度 L 和宽度 W 之间的差距应当尽可能小。
     *
     * @param area
     * @return
     */
    public int[] constructRectangle(int area) {
        int maxL = area;
        int maxW = 1;
        int[] res = new int[2];
        while (maxL >= maxW) {
            if (maxL * maxW == area) {
                res[0] = maxL;
                res[1] = maxW++;
            } else if (maxL * maxW > area) {
                maxL--;
            } else if (maxL * maxW < area) {
                maxW++;
            }
        }
        return res;
    }
}
