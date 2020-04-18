package collection.queu;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @fileName: SynchronousQueueQuiz
 * @description:
 * @create: 2020-04-17 12:32
 */
public class SynchronousQueueQuiz {
    public static void main(String[] args) throws Exception {
        BlockingQueue<Integer> queue = new SynchronousQueue<>();
        // 1. SynchronousQueue ���޿ռ�ģ�offer ��Զ���� false
        // 2. SynchronousQueue take() �����ᱻ���������뱻�����߳���ʾ�õ��� put() �����ſ���
        System.out.println("queue.offer(1) = " + queue.offer(1));
        System.out.println("queue.offer(2) = " + queue.offer(2));
        System.out.println("queue.offer(3) = " + queue.offer(3));
        System.out.println("queue.take() = " + queue.take());
        System.out.println("queue.size() = " + queue.size());
    }
}
