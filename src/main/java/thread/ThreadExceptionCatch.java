package thread;

/**
 * @fileName: ThreadExceptionCatch
 * @description:
 * @create: 2020-04-14 10:43
 */
public class ThreadExceptionCatch {
    public static void main(String[] args) throws InterruptedException {
        /**
         * �߳������쳣ʱ��������߳��쳣
         * �����ӡ�쳣��ջ���ڸ߲����б��� io ƿ��
         */
        Thread.setDefaultUncaughtExceptionHandler((thread, throwable) -> {
            System.out.printf("�߳�[%s]�������쳣����ϸ��Ϣ��[%s]\n ", thread.getName(), throwable.getMessage());
        });

        Thread thread = new Thread(() -> {
            System.out.println("�̣߳�" + Thread.currentThread().getName() + "����ִ��");
            throw new RuntimeException("�߳��׳��쳣");
        });
        thread.start();
        thread.join();
        // �̷߳����쳣��main �̲߳����ж�
        // Java Thread ��һ����װ������ GC ����������
        // JVM Thread ������һ�� OS Thread���� JVM ����
        // ���߳�ִ����ϣ����������߳������쳣��
        System.out.println("thread.isAlive = " + thread.isAlive());
    }
}
