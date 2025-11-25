public class InsertionSort {
    // Function for insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements that are greater than key
            // to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place key at the correct position
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        // Sorting function
        insertionSort(arr);
        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
