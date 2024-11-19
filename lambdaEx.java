@FunctionalInterface//one single method
interface MyLambda
{
    public int display(String str,String str2);
}

public class lambdaEx {
    public lambdaEx(String s)
    {
        System.out.println(s.toUpperCase());
    }
    public static void main(String[] args)
    {
        MyLambda ml = String::compareTo;

       System.out.println(ml.display("Hello Nigga","Helo Niga"));
    }
}
