import java.io.*;
import java.lang.*;

public class FileOpStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/Suryansh_JAVA/Test.txt");

            int x;

            do {
                x = fis.read();
                if(x != -1)
                  System.out.print((char) x);
            } while (x != -1);
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}