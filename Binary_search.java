public class Binary_search {
    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int target = 30;
    int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Not found");
    }
    }
    