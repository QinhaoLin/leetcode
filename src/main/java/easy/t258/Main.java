package easy.t258;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-02 14:47
 */
public class Main {
    public static void main(String[] args) {
        int num = 38;
        System.out.println("new Main().addDigits(num) = " + new Main().addDigits(num));
    }

    /**
     * ���֣�xyz=100*x+10*y+z=99*x+x+9*y+z=(99*x+9*y)+(x+y+z)��
     * Ҳ����˵xyz�ͣ�x+y+z������9��˵��ͬģ��,��xyz%9=��x+y+z��%9��
     * ������裨x+y+z��=ab��ͬ��ab%9=(a+b)%9��������һֱ�ݹ���ȥֱ��һλ���֣�Ҳ����˵���ǿ��Եõ�ģ9�Ľ����
     * ����������Ҫ����ģ10�Ľ����num%10=((num-1)%9+1)%10=(num-1)%9+1,������Ҫע����ǣ�1<=num<=9��Ȼ��д���뼴��
     *
     * @param num
     * @return
     */
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

}
