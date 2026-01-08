package recursion;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target, int left, int right) {
        // Base case: element not found
        if (left > right) {
            return -1;
        }

        // Find middle index
        int mid = left + (right - left) / 2;

        // If target is found
        if (arr[mid] == target) {
            return mid;
        }
        // Search left half
        else if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        }
        // Search right half
        else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }
}