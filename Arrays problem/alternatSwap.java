public class alternatSwap {

    public static int printAlternate(int arr[], int n) {
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(printAlternate(arr, 6));

    }

}