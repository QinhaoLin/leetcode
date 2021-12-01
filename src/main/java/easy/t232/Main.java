package easy.t232;

import java.util.Stack;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-12-01 14:22
 */
public class Main {
    public static void main(String[] args) {

    }


}

class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /**
     * ��Ԫ�� x �Ƶ����е�ĩβ
     *
     * @param x
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * �Ӷ��еĿ�ͷ�Ƴ�������Ԫ��
     *
     * @return
     */
    public int pop() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.pop();
    }

    /**
     * ���ض��п�ͷ��Ԫ��
     *
     * @return
     */
    public int peek() {
        if (outStack.isEmpty()) {
            in2out();
        }
        return outStack.peek();
    }

    /**
     * �������Ϊ�գ����� true �����򣬷��� false
     *
     * @return
     */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}