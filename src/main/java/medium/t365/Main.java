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

        // �������������������ֹ��ֹ����������ȥ
        Set<List<Integer>> set = new HashSet<>();

        // ����ÿ�β�����x��y��ʣ���ˮ������
        LinkedList<List<Integer>> res = new LinkedList<>();

        // ��ʼʱ��x y�о�û��ˮ
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

            // ��x����ˮ
            List<Integer> p1 = Arrays.asList(x, remain_y);
            if (!set.contains(p1)) {
                set.add(p1);
                res.add(p1);
            }

            // ��y����ˮ
            List<Integer> p2 = Arrays.asList(remain_x, y);
            if (!set.contains(p2)) {
                set.add(p2);
                res.add(p2);
            }

            // ���x��ˮ
            List<Integer> p3 = Arrays.asList(0, remain_y);
            if (!set.contains(p3)) {
                set.add(p3);
                res.add(p3);
            }

            // ���y��ˮ
            List<Integer> p4 = Arrays.asList(remain_x, 0);
            if (!set.contains(p4)) {
                set.add(p4);
                res.add(p4);
            }

            // x��y��ˮ
            int tmp_x = (remain_x + remain_y) <= y ? 0 : remain_x + remain_y - y;
            int tmp_y = (remain_x + remain_y) < y ? remain_x + remain_y : y;
            List<Integer> p5 = Arrays.asList(tmp_x, tmp_y);
            if (!set.contains(p5)) {
                set.add(p5);
                res.add(p5);
            }

            // y��x��ˮ
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
     * ��ʵ���ǿ� x �� y �����Լ���ܷ����� z��
     * ����������£�
     * �� a,b ������,�� gcd(a,b)=d����ô������������� x,y,ax+by ��һ����d�ı������ر�أ�һ���������� x,y��ʹ ax+by=d ������
     * ֮��ٿ���һ�·�������ʵ��������
     * �������Ҫ��ˮ��������ˮ�����������Լ���ı�������ˮ������������ˮ��������֮�ͣ���ô��Ȼ������������ˮ�������õ�����Ҫ��ˮ����
     * <p>
     * ������ : https://baike.baidu.com/item/%E8%A3%B4%E8%9C%80%E5%AE%9A%E7%90%86/5186593?fr=aladdin
     */
    public boolean canMeasureWater2(int x, int y, int z) {
        // ��һ��ƿ��Ϊ�յ��������һ��ƿ��ֻ�ܵ���ˮ����������Ȼû����
        if (x == 0 || y == 0) {
            if (x == z || y == z) return true;
            return false;
        }
        // ���У�x+y<zʱһ����false������ ��ϸƷһƷ
        if (x + y < z) return false;
        // շת�����  �ǲ����ر����� 3.12��ÿ��һ�� -> 1071. �ַ������������
        int tmp = gcd(x, y);
        return z % tmp == 0;
    }

    private int gcd(int x, int y) {
        if (y == 0) return x;
        return gcd(y, x % y);
    }
}
