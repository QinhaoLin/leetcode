package thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @fileName: ThreadPoolExceptionCatch
 * @description: 线程池捕获异常
 * @create: 2020-04-14 10:43
 */
public class ThreadPoolExceptionCatch {

    public static void main(String[] args) throws InterruptedException {
        // ThreadPoolExecutor
        // ExecutorService executorService = Executors.newFixedThreadPool(2);

        ThreadPoolExecutor executorService = new ThreadPoolExecutor(
                1,
                1,
                0,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>()
        ) {
            /**
             * 通过覆盖 {@link ThreadPoolExecutor#afterExecute(Runnable, Throwable)} 达到获取异常信息
             *
             * @param r
             * @param t
             */
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.printf("线程[%s]遇到了异常，详细信息：[%s]\n ", Thread.currentThread().getName(), t.getMessage());
            }
        };
        executorService.execute(() -> {
            throw new RuntimeException("线程抛出异常");
        });

        // 阻塞（等待）一秒钟，确保提交的任务完成
        executorService.awaitTermination(1, TimeUnit.SECONDS);

        // 关闭线程池
        executorService.shutdown();
    }

}
