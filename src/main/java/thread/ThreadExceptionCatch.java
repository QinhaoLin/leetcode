package thread;

/**
 * @fileName: ThreadExceptionCatch
 * @description:
 * @create: 2020-04-14 10:43
 */
public class ThreadExceptionCatch {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 线程遇到异常时，捕获该线程异常
         * 避免打印异常堆栈，在高并发中避免 io 瓶颈
         */
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            System.out.printf("线程[%s]遇到了异常，详细信息：[%s]\n ", thread.getName(), throwable.getMessage());
        });

        Thread thread = new Thread(() -> {
            System.out.println("线程：" + Thread.currentThread().getName() + "正在执行");
            throw new RuntimeException("线程抛出异常");
        });
        thread.start();
        thread.join();
        // 线程发生异常，main 线程不会中断
        // Java Thread 是一个包装，它由 GC 做垃圾回收
        // JVM Thread 可能是一个 OS Thread，被 JVM 管理，
        // 当线程执行完毕（正常或者线程遇到异常）
        System.out.println("thread.isAlive = " + thread.isAlive());
    }
}
