package thread;

/**
 * @fileName: CompleteAllThreadsQuestion
 * @description:
 * @create: 2020-04-15 12:32
 */
public class CompleteAllThreadsQuestion {
    public static void main(String[] args) {
        Thread t1 = new Thread(CompleteAllThreadsQuestion::action);
        Thread t2 = new Thread(CompleteAllThreadsQuestion::action);
        Thread t3 = new Thread(CompleteAllThreadsQuestion::action);

        t1.start();
        t2.start();
        t3.start();

        Thread mainThread = Thread.currentThread();
        // 获取 main 线程组
        ThreadGroup threadGroup = mainThread.getThreadGroup();
        // 活跃的线程数
        int count = threadGroup.activeCount();
        Thread[] threads = new Thread[count];
        // 把所有的线程复制到 threads 数组
        threadGroup.enumerate(threads, true);
        for (Thread thread : threads) {
            System.out.printf("当前活跃线程：%s\n", thread.getName());
        }

    }

    private static void action() {
        System.out.printf("线程[%S] 正在执行...\n", Thread.currentThread().getName());

    }
}
