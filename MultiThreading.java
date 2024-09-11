class MyRunnable implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + "   Hello");
            i++;
        }
    }
}

public class MultiThreading {
    static class MyThread extends Thread {
        public void run() {
            int i = 1;
            while (true) {
                System.out.println(i + " Hello");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread th = new Thread(t);
        th.start();
        int i = 1;

        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
