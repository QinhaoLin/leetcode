package medium.t365;

import java.util.*;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-07-23 10:25
 */
public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 4;
        System.out.println("new Main().canMeasureWater() = " + new Main().canMeasureWater(x, y, z));
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if (z > x + y) return false;
        if (x == z || y == z || x + y == z) return true;

        // 保存搜索过的情况，防止无止境的搜索下去
        Set<List<Integer>> set = new HashSet<>();

        // 保存每次操作后，x，y中剩余的水的容量
        LinkedList<List<Integer>> res = new LinkedList<>();

        // 初始时，x y中均没有水
        List<Integer> list = Arrays.asList(0, 0);
        set.add(list);
        res.add(list);

        while (!res.isEmpty()) {
            List<Integer> poll = res.poll();
            int remain_x = poll.get(0);
            int remain_y = poll.get(1);
            if (remain_x == z || remain_y == z || remain_x + remain_y == z) {
                return true;
            }

            // 给x加满水
            List<Integer> p1 = Arrays.asList(x, remain_y);
            if (!set.contains(p1)) {
                set.add(p1);
                res.add(p1);
            }

            // 给y加满水
            List<Integer> p2 = Arrays.asList(remain_x, y);
            if (!set.contains(p2)) {
                set.add(p2);
                res.add(p2);
            }

            // 清空x的水
            List<Integer> p3 = Arrays.asList(0, remain_y);
            if (!set.contains(p3)) {
                set.add(p3);
                res.add(p3);
            }

            // 清空y的水
            List<Integer> p4 = Arrays.asList(remain_x, 0);
            if (!set.contains(p4)) {
                set.add(p4);
                res.add(p4);
            }

            // x向y倒水
            int tmp_x = (remain_x + remain_y) <= y ? 0 : remain_x + remain_y - y;
            int tmp_y = (remain_x + remain_y) < y ? remain_x + remain_y : y;
            List<Integer> p5 = Arrays.asList(tmp_x, tmp_y);
            if (!set.contains(p5)) {
                set.add(p5);
                res.add(p5);
            }

            // y向x倒水
            tmp_y = (remain_x + remain_y) <= x ? 0 : remain_x + remain_y - x;
            tmp_x = (remain_x + remain_y) < x ? remain_x + remain_y : x;
            List<Integer> p6 = Arrays.asList(tmp_x, tmp_y);
            if (!set.contains(p6)) {
                set.add(p6);
                res.add(p6);
            }
        }

        return false;
    }

    /**
     * 其实就是看 x 和 y 的最大公约数能否整除 z，
     * 具体解释如下：
     * 若 a,b 是整数,且 gcd(a,b)=d，那么对于任意的整数 x,y,ax+by 都一定是d的倍数，特别地，一定存在整数 x,y，使 ax+by=d 成立。
     * 之后百科了一下发现这其实是裴蜀定理：
     * 如果所需要的水量是两个水壶容量的最大公约数的倍数，且水量不大于两个水壶的容量之和，那么必然可以用这两个水壶操作得到所需要的水量。
     * <p>
     * 裴蜀定理 : https://baike.baidu.com/item/%E8%A3%B4%E8%9C%80%E5%AE%9A%E7%90%86/5186593?fr=aladdin
     */
    public boolean canMeasureWater2(int x, int y, int z) {
        // 在一个瓶子为空的情况，另一个瓶子只能等于水的容量，不然没法搞
        if (x == 0 || y == 0) {
            if (x == z || y == z) return true;
            return false;
        }
        // 特判：x+y<z时一定是false！！！ 仔细品一品
        if (x + y < z) return false;
        // 辗转相除法  是不是特别眼熟 3.12的每日一题 -> 1071. 字符串的最大公因子
        int tmp = gcd(x, y);
        return z % tmp == 0;
    }

    private int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }
}
