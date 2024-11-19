import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(20);
        p.add(21);
        p.add(22);
        p.add(23);
        p.add(90);
        p.add(2);
        p.add(900);
        p.add(9);

        System.out.println(p.peek());
        p.poll();
        

        p.forEach((x)->System.out.println(x));

         
    }
}
