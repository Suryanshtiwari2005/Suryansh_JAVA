
//simport java.lang.*;
import java.util.*;

class input {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("May I know your name please");
        name = s.nextLine();
        s.close();
        System.out.println("Welcome Mr/Mrs " + name);
    }
}