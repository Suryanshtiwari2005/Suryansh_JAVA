
public class MultipleCatch {
    public static void main(String[] args) {
        int A[] = { 30, 20, 10, 44, 55 };
        try {
            int c = A[0] / A[6];
            System.out.println(c);
            System.out.println(A[9]);
        } catch (ArithmeticException e) {
            System.out.println("Out of Bounds: ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invalid: ");
        }
        System.out.println("Bye: ");

    }
}
