public class WrapperClass {
    public static void main(String[] args) {
        @SuppressWarnings("removal")
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Integer p = Integer.valueOf("33"); // Wrapping
        Integer l = p.intValue();
        // UnWrapping

        Integer t = 123; // auto Wrapping
        Integer o = t; // auto UNwrapping

        Byte c = 15;
        Byte d = Byte.valueOf("15");
        // Creates an object of type byte by conveting the string

        Byte bb = 15;
        Byte e = Byte.valueOf(bb);

        Short f = Short.valueOf("123");

        Float g = 12.3f;

        Float h = Float.valueOf("12.99");
        Float x = h.floatValue(); // Unboxing or unwrapping
        Float y = h; // auto unboxing/unwrapping

        Float k = 12.5f; // Internally it calls valueOf Method

        Double ll = Double.valueOf(33.868);
        Double m = 3242.84934;

        Character n = Character.valueOf('a');
        Character op = 's';

        Boolean pp = Boolean.valueOf("True");
        // not possible Boolean q = "false";

    }
}
