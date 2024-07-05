public class arrayproblem {

    // Function to find starting and end index
    static int[] findIndex(int arr[], int n, int key) {
        // code here.
        int startIndex = -1;
        int endIndex = -1;

        // Find start index (first occurrence from the left)
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                startIndex = i;
                break;
            }
        }

        // Find end index (first occurrence from the right)
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == key) {
                endIndex = i;
                break;
            }
        }

        return new int[] { startIndex, endIndex };
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 5 };
        System.out.println(findIndex(arr, 6, 5));

    }

}
