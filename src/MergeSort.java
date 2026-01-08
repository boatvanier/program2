public class MergeSort {
//Divide and conquer => merge sort
//1 Divide into smaller subproblems => divide the array into two halves
//2 Conquer each subproblem => sort each half recursively
//3 Combine the results of each subproblem to get final solution => merge the two sorted halves
//
//
//[4, 6, 7, 1, 8, 2, 5, 3] mergeSort(arr, 0, 7)
//
//[4, 6, 7, 1] mergeSort(arr, 0, 3)
//[4, 6]
//            [4]
//            [6]
//                  [4,6]
// [7,1]
//            [7]
//            [1]
//
//
//[8, 2, 5, 3] mergeSort(arr, 4, 7)

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return; // base case: there is only one or 0 element

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);      // left half
        mergeSort(arr, mid + 1, right); // right half

        merge(arr, left, mid, right);   // merge halves
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;      // left half pointer
        int j = mid + 1;   // right half pointer
        int k = 0;         // temp array pointer

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

}
