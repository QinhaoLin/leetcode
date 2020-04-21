package easy.t941;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-18 10:30
 */
public class Main {
    public static void main(String[] args) {
        int[] A = {0, 3, 2, 1};
        System.out.println("new Main().validMountainArray() = " + new Main().validMountainArray(A));
    }

    public boolean validMountainArray(int[] A) {
        if (A == null || A.length < 3) {
            return false;
        }
        int i = 0;
        // ��ɽ
        while (i < A.length - 1 && A[i] < A[i + 1]) {
            i++;
        }
        // �ų�ȫ�ǵ������ߵݼ������
        if (i == A.length - 1 || i == 0) {
            return false;
        }
        // ��ɽ
        while (i < A.length - 1 && A[i] > A[i + 1]) {
            i++;
        }
        if (i == A.length - 1) {
            return true;
        }
        return false;
    }

}
