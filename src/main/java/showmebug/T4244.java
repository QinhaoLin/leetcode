package showmebug;

/**
 * 优化Java字符串截取方法`substring`
 */
public class T4244 {
    public static void main(String[] args) {
        String expected = "bc";
        String raw = "abcde";
        int start = 1;
        int end = 3;
        String sub = sub(raw, start, end);
        System.out.println("sub = " + sub);
    }

    /**
     * 提取给定字符串中 start 到 end - 1 的部分并返回
     *
     * @param raw   需要被分割的字符串
     * @param start 开始下标
     * @param end   结束下标
     * @return 处理后的字符串
     */
    public static String sub(String raw, int start, int end) {
        // 空字符串返回 ""
        if (raw == null || raw.length() == 0) {
            return "";
        }
        int length = raw.length();
        // 对起始位置进行处理
        if (start < 0) {
            start += length;
            start = Math.max(start, 0);
        } else if (start > length) {
            start = length;
        }
        // 对结束位置进行处理
        if (end < 0) {
            end += length;
            end = end < 0 ? length : end;
        } else if (end > length) {
            end = length;
        }
        // 判断起始位置与结束位置是否需要合理
        if (end < start) {
            int temp = end;
            end = start;
            start = temp;
        }
        if (start == end) {
            return "";
        }
        // 切割并返回
        return raw.substring(start, end);
    }
}
