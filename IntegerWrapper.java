public class IntegerWrapper {
    public static void main(String[] args) {
        int m1 = 1500;

        Integer m3 = 150;
        Integer m2 = m1;
        System.out.println(m2.compareTo(m3));
        // compares two Integer Objects

        System.out.println(m3.equals(m1));
        // Can compare to primitive types too

        Integer m4 = Integer.valueOf("11111", 2);
        Integer m5 = Integer.valueOf("A7", 16);
        Integer m6 = Integer.valueOf("4", 8);
        // can also print ocatal directly

        // Can also print radix value in int form

        Integer m7 = Integer.decode("0xA7");

        Integer m8 = Integer.parseInt("123");
        // Converts String to INT

        m8 = Integer.reverseBytes(m8);
        // returns the value by reversing in two's Compliment

        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);
        System.out.println(m7);
        System.out.println(m8);
        System.out.println(Integer.toBinaryString(888));
        // converts to string

    }
}
