class WhiteBoard {
    String text;
    int NoOfStudent = 0, cnt = 0;

    public void attendance() {
        NoOfStudent++;
    }

    synchronized public void write(String t) {
        System.out.println("Teacher is Writing: " + t);
        while (cnt != 0) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        text = t;
        cnt = NoOfStudent;
        notifyAll();
    }

    synchronized public String read() {
        while (cnt == 0) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String t = text;
        cnt--;
        if (cnt == 0) {
            notify();
        }
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;
    String notes[] = { "Java is language", "It is OOPs", "It is Platform Independent", "It supports thread", "end" };

    public Teacher(WhiteBoard w) {
        wb = w;
    }

    public void run() {
        for (int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread {
    String name;
    WhiteBoard wb;

    public Student(String n, WhiteBoard w) {
        name = n;
        wb = w;
    }

    public void run() {
        String text;
        wb.attendance();
        do {
            text = wb.read();
            System.out.println(name + " Reading: " + text);
        } while (!text.equals("end"));
    }
}

public class Problem_196 {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. John", wb);
        Student s2 = new Student("2. Alice", wb);
        Student s3 = new Student("3. Bob", wb);
        Student s4 = new Student("4. Carol", wb);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
