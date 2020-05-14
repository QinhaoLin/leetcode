package easy.t744;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-13 11:35
 */
public class Main {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        System.out.println("new Main().nextGreatestLetter(letters, target) = " + new Main().nextGreatestLetter(letters, target));
    }

    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[0] > target) {
            return letters[0];
        }
        if (letters[letters.length - 1] <= target) {
            return letters[0];
        }
        int left = 0;
        int right = letters.length - 1;
        // 搜索区间
        // while(left <= right )的终止条件是 left == right + 1
        while (left <= right) {
            // (right + left) / 2
            // 防止溢出 left + (right - left) / 2
            int mid = left + (right - left) / 2;
            // 数字从左往右升序
            if (letters[mid] <= target) {
                // 目标值大于中位数时，往右区间搜索
                // 已经排除的区间[left, mid]
                // 需要搜索的区间[mid + 1, right]
                left = mid + 1;
            } else {
                // 目标值小于等于中位数时，往左区间搜索
                // 已经排除的区间[mid, right]
                // 需要搜索的区间[left, mid - 1]
                right = mid - 1;
            }
        }
        return left < letters.length ? letters[left] : letters[0];
    }
}
