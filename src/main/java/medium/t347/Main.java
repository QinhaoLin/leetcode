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
        // key：元素，value：对应元素出现次数
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 因为 fre 的下标表示频率，而 nums 数组最大频率就是 nums.length，
        // 所以 fre 的下标最大应该是 nums.length，所以长度是 nums.length + 1
        LinkedList<Integer>[] fre = new LinkedList[nums.length + 1];

        // fre 下标表示出现频率，LinkedList<Integer> 表示出现元素的集合
        for (Integer key : map.keySet()) {
            int value = map.get(key);
            if (fre[value] == null) {
                fre[value] = new LinkedList<>();
            }
            fre[value].add(key);
        }

        List<Integer> res = new ArrayList<>();
        //倒序遍历频率数组，这样可以获取频率从高到低的数字
        for (int i = fre.length - 1; i >= 0 && res.size() < k; i--) {
            LinkedList<Integer> list = fre[i];
            //如果当前频率没有数字，跳过
            if (list == null) {
                continue;
            }
            //相同频率的数字可能有多个，这个只取k个就行，注意顺序是从左往右取
            while (res.size() < k && !list.isEmpty()) {
                res.add(list.removeFirst());
            }
        }
        return res;
    }
}
