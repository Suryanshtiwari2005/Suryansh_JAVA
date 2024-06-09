import java.util.*;

class keyboard {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter two Numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        s.close();
        System.out.println("Sum is " + c);
    }
}