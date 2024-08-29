class NegativeDimensionException extends Exception {
    @Override
    public String toString() {
        return "Dimension canot be Negative";
    }
}

public class throwNcatch {
    public static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        int a = l / b;
        return a;

    }

    public static void main(String[] args) {
        try {
            int result = area(0, 5);
            System.out.println("Area: " + result);

        } catch (NegativeDimensionException e) {
            System.out.println(
                    "Exception Found");
        }
    }
}
