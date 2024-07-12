public class Butterfly {
    public static void PrintButterfly(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // inner loop for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // half part outer loop
        for (int i = n; i >= 1; i--) {
            // inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // inner loop for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PrintButterfly(10);
    }
}
