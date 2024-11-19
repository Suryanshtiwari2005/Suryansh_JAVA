public class Generic<T> {
    T data[] = (T[]) new Object[3]; 

    public static void main(String[] args)
    {
        Generic<String> gd = new Generic<>();//array becomes whatever type you want in this case String

        gd.data[0]="hi";
        gd.data[1]="Bye";
      //  gd.data[2]=new Integer(10);
      //  at compile time Generic data checks if its Integer or String and Gives Error if not according to Generic Data in this case Generic Data was of type String but we tried to store Integer type(Using type casting) 
      //which cause in Giving error during compile time only
      //"One Benefit of Generic Data tells errors at compile time only not like object"

      String str = gd.data[0];
    }
}
