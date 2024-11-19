import java.io.*;
import java.lang.*;

public class Reading{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("test1.txt");
        FileOutputStream fos = new FileOutputStream("test2.txt");

        int b;
        while((b = fis.read()) != -1)
        {
            if(b >= 65 && b <= 90) fos.write(b+32);
            else fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
