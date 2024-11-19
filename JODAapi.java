import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class JODAapi {
    public static void main(String[] args) throws Exception
    {
        

        LocalTime t = LocalTime.now();
        System.out.println(t);
        LocalTime t1 = t.minusHours(3);
        System.out.println(t1);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
        
    }
}
