import java.util.*;

public class DequDemo {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(10);
        dq.offer(20);
        dq.offer(30);
        dq.offer(40);
        dq.offer(69);

        

        dq.offerFirst(20);
        dq.offerFirst(23);

        dq.offerLast(90);
        dq.offerLast(34);
        dq.forEach((x)->System.out.println(x));
    }
}
