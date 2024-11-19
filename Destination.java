import java.io.*;

public class Destination {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("test1.txt");
        FileInputStream fis1 = new FileInputStream("test2.txt");

        FileOutputStream fos = new FileOutputStream("FinalTest.txt");

        SequenceInputStream sis = new SequenceInputStream(fis,fis1);

        int b;
        while((b = sis.read()) != -1)
        {
            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis.close();
        fos.close();
    }
}
