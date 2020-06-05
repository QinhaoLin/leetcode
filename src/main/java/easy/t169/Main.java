package easy.t169;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-06-05 14:09
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println("new Main().majorityElement() = " + new Main().majorityElement(nums));
    }

    /**
     * 摩尔投票法：
     * 从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数，总能找到最多的那个
     * <p>
     * 核心就是对拼消耗。
     * 玩一个诸侯争霸的游戏，假设你方人口超过总人口一半以上，并且能保证每个人口出去干仗都能一对一同归于尽。最后还有人活下来的国家就是胜利。
     * 那就大混战呗，最差所有人都联合起来对付你（对应你每次选择作为计数器的数都是众数），
     * 或者其他国家也会相互攻击（会选择其他数作为计数器的数），但是只要你们不要内斗，最后肯定你赢。
     * 最后能剩下的必定是自己人。
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (res == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    res = nums[i + 1];
                }
            }
        }
        return res;
    }
}
