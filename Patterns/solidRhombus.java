public class solidRhombus {
    public static void printSolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSolidRhombus(10);
    }
}
