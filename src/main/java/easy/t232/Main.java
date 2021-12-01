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
     * 将元素 x 推到队列的末尾
     *
     * @param x
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * 从队列的开头移除并返回元素
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
     * 返回队列开头的元素
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
     * 如果队列为空，返回 true ；否则，返回 false
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