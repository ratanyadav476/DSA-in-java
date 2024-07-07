public class MaxminInArr {

    public static long getMinMax(long a[], long n) {
        // Write your code here
        long minimum = Integer.MAX_VALUE;
        long maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (maximum < a[i]) {
                maximum = a[i];
            }
            if (minimum > a[i]) {
                minimum = a[i];
            }
        }
        System.out.print(minimum + " ");
        return maximum;
    }

    public static void main(String[] args) {
        long A[] = { 3, 2, 1, 56, 10000, 167 };
        System.out.println(getMinMax(A, 6));
    }
}
