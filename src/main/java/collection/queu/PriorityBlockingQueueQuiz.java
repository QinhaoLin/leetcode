package collection.queu;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @fileName: PriorityBlockingQueueQuiz
 * @description:
 * @create: 2020-04-17 12:29
 */
public class PriorityBlockingQueueQuiz {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(2);
        // 1. PriorityBlockingQueue#put() 方法不阻塞
        // 2. PriorityBlockingQueue#offer() 方法不限制长度
        // 3. PriorityBlockingQueue 插入元素会做排序，默认按照元素 Comparable 实现，或者显式传递 Comparable
        queue.put(9);
        queue.put(1);
        queue.put(8);
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.take() = " + queue.take());
        System.out.println("queue = " + queue);
    }
}
