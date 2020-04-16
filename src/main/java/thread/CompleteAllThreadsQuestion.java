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
        // ��ȡ main �߳���
        ThreadGroup threadGroup = mainThread.getThreadGroup();
        // ��Ծ���߳���
        int count = threadGroup.activeCount();
        Thread[] threads = new Thread[count];
        // �����е��̸߳��Ƶ� threads ����
        threadGroup.enumerate(threads, true);
        for (Thread thread : threads) {
            System.out.printf("��ǰ��Ծ�̣߳�%s\n", thread.getName());
        }

    }

    private static void action() {
        System.out.printf("�߳�[%S] ����ִ��...\n", Thread.currentThread().getName());

    }
}
