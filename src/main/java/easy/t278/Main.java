package easy.t278;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-05-15 10:41
 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("new Main().firstBadVersion() = " + new Main().firstBadVersion(n));
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            // 1 + (5-1) / 2 = 3
            int mid = start + (end - start) / 2;
            // ��� isBadVersion() �ӿڷ��� true��
            // ˵�� mid ֮ǰ�İ汾���Ǵ���ģ���Ҫ��ǰ��İ汾����
            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static boolean isBadVersion(int version) {
        if (version >= 2) {
            return true;
        }
        return false;
    }

}
