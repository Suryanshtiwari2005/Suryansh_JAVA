import java.util.*;

public class BitsSetDemo {
    public static void main(String[] args)
    {
        BitSet bs1 = new BitSet();

        bs1.set(0);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);
        bs1.set(8);
        bs1.set(10);
        
        BitSet bs2 = new BitSet();
        //bs2.set(0);
        bs2.set(1);
       // bs2.set(2);
        bs2.set(3);
        bs2.set(4);
        bs2.set(5);
        bs2.set(6);
        bs2.set(7);
        //bs2.set(8);
        bs2.set(9);
        //bs2.set(10);

        bs1.and(bs2);
        System.out.println(bs1);
    }
}