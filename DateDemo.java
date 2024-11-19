import java.util.*;

public class DateDemo {
    public static void main(String[] args)
    {
       /*  System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        System.out.println(Long.MAX_VALUE);
        */
        Date d = new Date();
        @SuppressWarnings("Deprecation")
        int Month = d.getYear();
        System.out.println(Month+1900);
    }
}
