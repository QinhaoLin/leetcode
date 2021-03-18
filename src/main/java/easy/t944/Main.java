package easy.t944;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-18 10:54
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = new String[]{"cba", "daf", "ghi"};
        System.out.println("new Main().minDeletionSize(strs) = " + new Main().minDeletionSize(strs));
    }

    public int minDeletionSize(String[] strs) {
        // ап
        int col = strs[0].length();
        // ее
        int rows = strs.length;
        int count = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows - 1; j++) {
                if (strs[j + 1].charAt(i) < strs[j].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
