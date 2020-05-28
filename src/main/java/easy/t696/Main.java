package easy.t696;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-28 18:04
 */
public class Main {
    public static void main(String[] args) {
        String s = "00110011";
        System.out.println("new Main().countBinarySubstrings() = " + new Main().countBinarySubstrings(s));
    }

    public int countBinarySubstrings(String s) {
        // 记录前一个数字出现的次数
        int preLen = 0;
        // 记录当前数字出现的次数
        int curLen = 1;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            // 判断当前数字是否与后一个数字相同
            if (s.charAt(i) == s.charAt(i - 1)) {
                // 相同，则当前数字出现的次数cur加1
                curLen++;
            } else {
                // 不同，则当前数字事实上变成了前一个数字，当前数字的次数重置为1
                preLen = curLen;
                curLen = 1;
            }

            // 前一个数字出现的次数 >= 后一个数字出现的次数，则一定包含满足条件的子串
            // preLen 记录之前连续0或1，curLen 记录现在的连续1或0，
            // preLen >= curLen，比如现在有1个1，那么之前有1个或者2个、3个0，01、001、0001、都包含一个符合条件的解01，即满足条件。
            if (preLen >= curLen) {
                count++;
            }
        }
        return count;
    }

}
