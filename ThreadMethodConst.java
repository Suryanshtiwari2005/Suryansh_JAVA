class MyThread extends Thread {
    public MyThread(String name) {
        super(name);

    }

    public void run() {
        int count = 1;
        while (true) {
            System.out.println(count++);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Thread interrupted: " + e.getMessage());
                break;
            }
        }

    }
}

public class ThreadMethodConst {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread("My Thread 1");

        t.start();
        t.interrupt();
    }
}
