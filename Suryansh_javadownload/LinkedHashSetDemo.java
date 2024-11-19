import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args)
    {
        HashSet<String> lhs = new HashSet<>();

        lhs.add("HIi");
        lhs.add("Bye");
        lhs.add("Andi Mandi");
        lhs.add("Uga Buga");

        lhs.forEach(System.out::println);
    }
}
