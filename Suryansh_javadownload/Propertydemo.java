import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class Propertydemo {
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();

       /*  p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Win10");
        p.setProperty("Model", "Latitude");

        p.store(new FileOutputStream("D:\\Suryansh_JAVA\\MyData.xml"),"Laptop");

        System.out.println(p);
        */
        p.load(new FileInputStream("D:\\Suryansh_JAVA\\MyData.xml"));

        System.out.println(p.getProperty("Name"));
    }
}
