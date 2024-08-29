import java.util.*;

public class menuP {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 Numbers");
        int x = s.nextInt();
        int y = s.nextInt();
        s.nextLine();
        System.out.println("Enter Options in Words");
        String option = s.nextLine();
        option = option.toUpperCase();
        s.close();

        switch (option) {
            case "ADD":
                System.out.println("Sum is " + (x + y));
                break;

            case "SUB":
                System.out.println("Sub is " + (x - y));
                break;

            case "MUL":
                System.out.println("Mul is " + (x * y));
                break;

            case "Div":
                System.out.println("Div is " + (x / y));
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

    }
}