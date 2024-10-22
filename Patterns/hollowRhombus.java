public class hollowRhombus {

    public static void printHollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            // for (int j = 1; j <= (n - i); j++) {
            // System.out.print(" ");
            // }
            // inner loop for stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHollowRhombus(7);
    }
}
