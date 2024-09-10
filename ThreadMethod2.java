class MyThread extends Thread {

    public MyThread() {
        super();
    }

    public void run() {
        int count = 1;

        while (true) {
            System.out.println(count++);
        }
    }
}

public class ThreadMethod2 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }

    }
}
