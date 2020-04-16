package Interview.t01_01;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-16 15:59
 */
public class Main {
    public static void main(String[] args) {
        String s = "letecode";
        System.out.println("new Main().isUnique() = " + new Main().isUnique(s));
    }

    public boolean isUnique(String astr) {
        long x = 0; //采用位运算来实现空间复杂度O（1）
        int n = astr.length();
        for (int i = 0; i < n; i++) {
            int c = astr.charAt(i) - 'a';
            if (((x >> c) & 1) == 1) { // 如果这一位是1说明有重复
                return false;
            }
            x |= (1 << c); // 把对应位置修改为1
        }
        return true;
    }
}
