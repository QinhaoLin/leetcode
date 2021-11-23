package easy.t225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @fileName: Main
 * @description:
 * @create: 2021-11-23 10:36
 */
public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        int top = myStack.top();
        System.out.println("top = " + top);
        int pop1 = myStack.pop();
        int pop2 = myStack.pop();
        System.out.println("pop1 = " + pop1);
        System.out.println("pop2 = " + pop2);
        System.out.println("myStack.empty() = " + myStack.empty());
    }
}

class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        int n = queue.size();
        // 将元素添加到队尾
        queue.offer(x);
        // 将旧元素重新入队，逐一压入队尾
        for (int i = 0; i < n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        /**
         * 返回并移除队列的头
         */
        return queue.poll();
    }

    public int top() {
        /**
         * 返回队列的头
         */
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}