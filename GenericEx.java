class Data<t>
{
    private t obj;

    public void SetData(t v)
    {
        obj = v;
    }
    public t GetData()
    {
        return obj;
    }
}
@SuppressWarnings("Unchecked")
class MyArray<f>
{
    f A[] = (f[]) new Object[10]; 
    //to creeate an array of generic we have to type cast it as Object
    int length = 0;

    public void append(f v)
    {
        A[length++] = v;
    }
    public void display()
    {
        for(int i = 0; i<length; i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class GenericEx {
    public static void main(String[] args)
    {
        // Data<Integer> d = new Data<>();
        // d.SetData(10);

        // Data<String> f = new Data<>();
        // f.SetData("null");

        // System.out.println(d.GetData());
        // System.out.println(f.GetData());

        MyArray<Integer> ma = new MyArray<>();

        ma.append(10);
        ma.append(11);
        ma.append(12);

        ma.display();
    }
}
