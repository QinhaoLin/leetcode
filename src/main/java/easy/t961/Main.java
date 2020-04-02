package easy.t961;

/**
 * @fileName: Main
 * @description:
 * @create: 2020-04-02 22:08
 */
public class Main {

    public static void main(String[] args) {
        int[] A = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println("new Main().repeatedNTimes() = " + new Main().repeatedNTimes(A));
    }

    /**
     * ��һ�����ظ�N�Σ������������ĸ���Ϊ2N����ˣ�Ҳ����˵��Ҫ��������ռ��һ�롣
     * ��ô��Ȼ�ɵã�һ�����������������������������������ȣ�Ҳ������Ҫ�������
     * �ٸ����ӣ�����������[1, 2, 4, 5, 3, 3, 3, 3][1,2,4,5,3,3,3,3]��
     * ��ô��3�����ɢ��������[1, 3, 2, 3, 4, 3, 5, 3][1,3,2,3,4,3,5,3]��
     * ���Է���������ô�ţ�һ������������������������д���������ͬ������
     *
     * @param arr
     * @return
     */
    public int repeatedNTimes(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 2; i++) {
            if (arr[i] == arr[i + 1] || arr[i] == arr[i + 2]) {
                return arr[i];
            }
        }

        // ����ѭ��û�ҵ����Ǳ�Ȼ���������������ȵġ� ���磺[1, 2, 3, 1]
        return arr[len - 1];
    }
}
