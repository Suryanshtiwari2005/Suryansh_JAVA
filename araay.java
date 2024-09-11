
public class araay {
    public static void main(String[] args) {
        // int A[] = new int[10];
        int B[] = { 1, 2, 13, 4, 5 };
        int C[];

        C = new int[10];
        int max = Integer.MIN_VALUE;

        // int sum = 0;
        // int key;
        // Scanner s = new Scanner(System.in);

        // System.out.println("Enter the key");
        // key = s.nextInt();

        // for (int i = 0; i < B.length; i++) {
        // if (B[i] == key) {
        // System.out.println("Key is found " + i);
        // System.exit(0);
        // }
        // }
        // System.out.println("Key is not found");

        for (int i = 0; i < B.length; i++) {
            if (B[i] > max) {
                max = B[i];
            }
        }
        System.out.println(max);

    }

}