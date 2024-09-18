/**
 * ----*
 * ---**
 * --***
 * -****
 *****
 */
public class patternThree {
    public static void printpatternthree(int n) {
        // outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printpatternthree(5);
    }
}