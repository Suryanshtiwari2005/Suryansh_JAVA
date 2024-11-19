import java.util.*;

public class Calender {
    public static void main(String[] args)
    {
        GregorianCalendar gc = new GregorianCalendar();
        
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getID());
       // System.out.println(gc.isLeapYear(2025));
      // System.out.println((gc.get(Calendar.DAY_OF_YEAR)));

    }
}
