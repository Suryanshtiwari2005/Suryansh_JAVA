
public class ExceptionDemo {
    static void fun1() {
        // System.out.println(10 / 0); // unchecked, but it will throw an
        // ArithmeticException at runtime
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // prints the exception message
        }
    }

    static void fun2() {
        // You can add code here if you want to handle different scenarios
    }

    static void fun3() {
        // You can add code here if you want to handle different scenarios
    }

    public static void main(String[] args) {
        fun1(); // This will trigger fun1 and demonstrate exception handling
    }
}
