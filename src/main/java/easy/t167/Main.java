package easy.t167;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-03-20 19:58
 */
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 13;
        // Êä³ö: [1,2]
        System.out.println("new Main().twoSum2(numbers, target) = " + Arrays.toString(new Main().twoSum2(numbers, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.get(numbers[i]) != null) {
                res[0] = map.get(numbers[i]) + 1;
                res[1] = i + 1;
                return res;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return new int[0];
    }
    
    public int[] twoSum2(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            if (numbers[j] + numbers[i] == target) {
                break;
            }
            while (i < j && numbers[j] + numbers[i] > target) {
                j--;
            }
            while (i < j && numbers[j] + numbers[i] < target) {
                i++;
            }
        }
        return new int[]{i + 1, j + 1};


    }
}
