class MyThread1 extends Thread {
    MyData d;

    MyThread1(MyData dat) {
        d = dat;
    }

    public void run() {
        d.display("Hello World");
    }
}

class MyThread2 extends Thread {
    MyData data;

    MyThread2(MyData dat) {
        data = dat;
    }

    public void run() {
        data.display("Welcome");
    }
}

class MyData {
    void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}

class Test {
    public static void main() {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}