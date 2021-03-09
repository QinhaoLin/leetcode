package easy.t155;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-03-09 13:40
 */
public class Main {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(1);
        obj.push(2);
        obj.push(-1);
        obj.push(10);
        obj.push(20);
        obj.pop();
        int top = obj.top();
        System.out.println("top = " + top);
        int getMin = obj.getMin();
        System.out.println("getMin = " + getMin);
    }
}

class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    /**
     * ��Ԫ�� x ����ջ��
     *
     * @param x
     */
    public void push(int x) {
        xStack.push(x);
        /**
         * minStack ջ������ xStack ջ�ĸ߶�һ��
         * xStack ��ջʱ��minStack Ҳ��ջ��ȡ��ջ��Ԫ������ջԪ����ȣ�����Сֵ��ջ
         */
        minStack.push(Math.min(minStack.peek(), x));
    }

    /**
     * ɾ��ջ����Ԫ��
     */
    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    /**
     * ��ȡջ��Ԫ��
     *
     * @return
     */
    public int top() {
        return xStack.peek();
    }

    /**
     * ����ջ�е���СԪ��
     *
     * @return
     */
    public int getMin() {
        return minStack.peek();
    }
}
