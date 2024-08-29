import java.io.*;

public class ResourceDemo {
    static FileInputStream fi;

    static void Divide() throws FileNotFoundException {
        File file = new File("Resource");
        String path = file.getAbsolutePath();
        fi = new FileInputStream(path);
    }

    public static void main(String[] args) throws Exception {

    }

}
