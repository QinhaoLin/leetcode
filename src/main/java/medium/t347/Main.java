package medium.t347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-20 09:52
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 4};
        int k = 3;
        System.out.println("new Main().topKFrequent() = " + new Main().topKFrequent(nums, k));
    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return new ArrayList<>();
        }
        // key��Ԫ�أ�value����ӦԪ�س��ִ���
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // ��Ϊ fre ���±��ʾƵ�ʣ��� nums �������Ƶ�ʾ��� nums.length��
        // ���� fre ���±����Ӧ���� nums.length�����Գ����� nums.length + 1
        LinkedList<Integer>[] fre = new LinkedList[nums.length + 1];

        // fre �±��ʾ����Ƶ�ʣ�LinkedList<Integer> ��ʾ����Ԫ�صļ���
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (fre[value] == null) {
                fre[value] = new LinkedList<>();
            }
            fre[value].add(key);
        }

        List<Integer> res = new ArrayList<>();
        //�������Ƶ�����飬�������Ի�ȡƵ�ʴӸߵ��͵�����
        for (int i = fre.length - 1; i >= 0 && res.size() < k; i--) {
            LinkedList<Integer> list = fre[i];
            //�����ǰƵ��û�����֣�����
            if (list == null) {
                continue;
            }
            //��ͬƵ�ʵ����ֿ����ж�������ֻȡk�����У�ע��˳���Ǵ�������ȡ
            while (res.size() < k && !list.isEmpty()) {
                res.add(list.removeFirst());
            }
        }
        return res;
    }
}
