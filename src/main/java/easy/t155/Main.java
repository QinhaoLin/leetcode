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
     * 将元素 x 推入栈中
     *
     * @param x
     */
    public void push(int x) {
        xStack.push(x);
        /**
         * minStack 栈保持与 xStack 栈的高度一样
         * xStack 入栈时，minStack 也入栈，取的栈顶元素与入栈元素相比，用最小值入栈
         */
        minStack.push(Math.min(minStack.peek(), x));
    }

    /**
     * 删除栈顶的元素
     */
    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    /**
     * 获取栈顶元素
     *
     * @return
     */
    public int top() {
        return xStack.peek();
    }

    /**
     * 检索栈中的最小元素
     *
     * @return
     */
    public int getMin() {
        return minStack.peek();
    }
}
