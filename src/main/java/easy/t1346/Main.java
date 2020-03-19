package easy.t1346;

import java.util.HashMap;
import java.util.Map;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-19 12:19
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 11};
        System.out.println("new Main().checkIfExist(arr) = " + new Main().checkIfExist(arr));
    }

    public boolean checkIfExist(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        int size = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
            if ((arr[i] % 2 == 0 && map.containsKey(arr[i] / 2)) || map.containsKey(arr[i] * 2)) {
                return true;
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }
}
