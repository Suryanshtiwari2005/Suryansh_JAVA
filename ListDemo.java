import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();

        LinkedList<Integer> arr2 = new LinkedList<>(List.of(50,60,70,80));

        arr.add(10);
        arr.add(0,4);
        arr.addAll(arr2);

        arr.addFirst(45);
        arr.addLast(34);

        arr.forEach(System.out::println);

    }
}
