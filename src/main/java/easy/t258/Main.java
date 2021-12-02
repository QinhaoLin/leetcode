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
     * 数字：xyz=100*x+10*y+z=99*x+x+9*y+z=(99*x+9*y)+(x+y+z)，
     * 也就是说xyz和（x+y+z）对于9来说是同模的,即xyz%9=（x+y+z）%9，
     * 这里假设（x+y+z）=ab，同理（ab%9=(a+b)%9），可以一直递归下去直到一位数字，也就是说我们可以得到模9的结果，
     * 但是我们需要的是模10的结果，num%10=((num-1)%9+1)%10=(num-1)%9+1,这里需要注意的是，1<=num<=9，然后写代码即可
     *
     * @param num
     * @return
     */
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

}
