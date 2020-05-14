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
        // ��������
        // while(left <= right )����ֹ������ left == right + 1
        while (left <= right) {
            // (right + left) / 2
            // ��ֹ��� left + (right - left) / 2
            int mid = left + (right - left) / 2;
            // ���ִ�����������
            if (letters[mid] <= target) {
                // Ŀ��ֵ������λ��ʱ��������������
                // �Ѿ��ų�������[left, mid]
                // ��Ҫ����������[mid + 1, right]
                left = mid + 1;
            } else {
                // Ŀ��ֵС�ڵ�����λ��ʱ��������������
                // �Ѿ��ų�������[mid, right]
                // ��Ҫ����������[left, mid - 1]
                right = mid - 1;
            }
        }
        return left < letters.length ? letters[left] : letters[0];
    }
}
