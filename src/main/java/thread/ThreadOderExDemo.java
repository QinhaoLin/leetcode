package thread;

/**
 * @fileName: ThreadOderExDemo
 * @description: �߳�˳��ִ��
 * @create: 2020-04-14 09:36
 */
public class ThreadOderExDemo {
    public static void main(String[] args) throws InterruptedException {
        demo3();
    }

    private static void demo3() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            action();
        }, "t1");
        Thread t2 = new Thread(() -> {
            action();
        }, "t2");
        Thread t3 = new Thread(() -> {
            action();
        }, "t3");
        thradStartAndWait(t1);
        thradStartAndWait(t2);
        thradStartAndWait(t3);
    }
    private static void thradStartAndWait(Thread thread) throws InterruptedException {
        if (Thread.State.NEW.equals(thread.getState())){
            thread.start();
        }

        while (thread.isAlive()) {
            synchronized (thread) {
                // ������˭֪ͨ Thread -> thread.notify();
                thread.wait();
            }
        }
    }

    /**
     * ʹ��������ʽʵ��
     */
    private static void demo2() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            action();
        }, "t1");
        Thread t2 = new Thread(() -> {
            action();
        }, "t2");
        Thread t3 = new Thread(() -> {
            action();
        }, "t3");

        t1.start();
        while (t1.isAlive()) {
            // Thread.Sleep(0)�����ã����ǡ���������ϵͳ�������½���һ�� CPU ��������
            Thread.sleep(0);
        }

        t2.start();
        while (t2.isAlive()) {
            Thread.sleep(0);
        }

        t3.start();
        while (t3.isAlive()) {
            Thread.sleep(0);
        }
    }

    /**
     * start-join ��ʽʵ��
     *
     * @throws InterruptedException
     */
    private static void demo1() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            action();
        }, "t1");
        Thread t2 = new Thread(() -> {
            action();
        }, "t2");
        Thread t3 = new Thread(() -> {
            action();
        }, "t3");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }

    public static void action() {
        String name = Thread.currentThread().getName();
        System.out.println("�̣߳�" + name + "����ִ��");
    }

}
