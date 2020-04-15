package thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @fileName: ThreadPoolExceptionCatch
 * @description: �̳߳ز����쳣
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
             * ͨ������ {@link ThreadPoolExecutor#afterExecute(Runnable, Throwable)} �ﵽ��ȡ�쳣��Ϣ
             *
             * @param r
             * @param t
             */
            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.printf("�߳�[%s]�������쳣����ϸ��Ϣ��[%s]\n ", Thread.currentThread().getName(), t.getMessage());
            }
        };
        executorService.execute(() -> {
            throw new RuntimeException("�߳��׳��쳣");
        });

        // �������ȴ���һ���ӣ�ȷ���ύ���������
        executorService.awaitTermination(1, TimeUnit.SECONDS);

        // �ر��̳߳�
        executorService.shutdown();
    }

}
