import java.util.List;

class OldClass
{
    public void display()
    {
        System.out.println(" Hello ");
    }
    @Deprecated //sugesting a programer not use a method
    public void show()
    {
        System.out.println(" Hi ");
    }
}

public class deprecated {
    static List l;
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        l.add(10);
        /*OldClass oc = new OldClass();
        oc.show();
        */
    }
}
