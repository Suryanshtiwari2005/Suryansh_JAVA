import java.math.*;

public class MathClass {
    public static void main(String[] args) {
        System.out.println("Absolute :");
        System.out.println(Math.abs(-123));
        // returns only + value
        // may or maynot use StrictMath

        System.out.println("Absolute :");
        System.out.println(StrictMath.abs(-123));
        // Gives Absolute Value

        System.out.println("Cube Root :");
        System.out.println(Math.cbrt(9));
        // Returns cube root

        int i = Integer.MIN_VALUE;
        i--;
        System.out.println(i);
        // Overflow condition so it becomes largest no

        System.out.println("Exact Decrement :");
        System.out.println(Math.decrementExact(5));
        // this doesn't show overflow condition but gives Exception

        System.out.println("Exponent value in Floating Point Rep. :");
        System.out.println(Math.getExponent(123.45));

        System.out.println("Round Division :");
        System.out.println(Math.floorDiv(50,3));
        //Gives floor value of div

        System.out.println("e power x :");
        System.out.println(Math.exp(1));
        //e^x
        //may or maynot use StrictMath Internally

        System.out.println(StrictMath.exp(1));

        System.out.println("Log Base 10 :");
        System.out.println(Math.log10(100));
        //returns log base 10

        System.out.println("Maximum :");
        System.out.println(Math.max(100,50));
        //return max of two No. also have min

        System.out.println("Tan :");
        System.out.println(Math.tan(45*Math.PI/180));
        //Takes Radian value

        System.out.println("Convert to Radians :");
        System.out.println(Math.toRadians(90));
        //Converts int to Radians

        System.out.println("Convert To Degree :");
        System.out.println(Math.toDegrees(Math.atan(1)));
        //arc tan

        System.out.println("Convert to Degree :");
        System.out.println(StrictMath)

    }
}
