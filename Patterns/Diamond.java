public class Diamond {
    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // second half diamond part
        for (int i = n; i >= 1; i--) {
            // inner loop for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(15);
    }
}
