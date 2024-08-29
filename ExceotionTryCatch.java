import java.util.*;

public class ExceotionTryCatch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Type First No.: ");
        int a = s.nextInt();
        System.out.println("Type Second No.: ");
        int b = s.nextInt();
        s.close();
        int c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denomintor should'nt be zero,Try again");
        }
    }
}
