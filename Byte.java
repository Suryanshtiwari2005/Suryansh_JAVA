import java.io.*;

public class Byte {
    public static void main(String[] args)throws Exception
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        bos.writeTo(new FileOutputStream("D:\\Suryansh_JAVA\\FinalTest.txt"));
        bos.close();
    }    
}
