package recursion;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {

    // ============================
    // Question 1: Longest Consecutive Increasing Subsequence
    // ============================
    public static int longestConsecutiveIncreasing(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;
        return helper(list, 0, 1, 1);
    }

    // Recursive helper: index = current index, currLen = current subsequence length, maxLen = maximum found
    private static int helper(List<Integer> list, int index, int currLen, int maxLen) {
        if (index == list.size() - 1) {
            return Math.max(currLen, maxLen);
        }

        if (list.get(index + 1) > list.get(index)) {
            // increasing, extend current length
            return helper(list, index + 1, currLen + 1, Math.max(currLen + 1, maxLen));
        } else {
            // reset current length
            return helper(list, index + 1, 1, Math.max(currLen, maxLen));
        }
    }

    // ============================
    // Question 2: Divide-and-Conquer Count of Ordered Pairs
    // ============================
    public static int countOrderedPairs(List<Integer> list) {
        if (list == null || list.size() <= 1) return 0;
        List<Integer> temp = new ArrayList<>(list);
        return countPairs(list, 0, list.size() - 1, temp);
    }

    // Recursive divide-and-conquer
    private static int countPairs(List<Integer> list, int left, int right, List<Integer> temp) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;

        int leftCount = countPairs(list, left, mid, temp);
        int rightCount = countPairs(list, mid + 1, right, temp);
        int crossCount = mergeAndCount(list, left, mid, right, temp);

        return leftCount + rightCount + crossCount;
    }

    // Merge step counts pairs across left and right
    private static int mergeAndCount(List<Integer> list, int left, int mid, int right, List<Integer> temp) {
        for (int i = left; i <= right; i++) temp.set(i, list.get(i)); // copy to temp

        int i = left;
        int j = mid + 1;
        int k = left;
        int count = 0;

        while (i <= mid && j <= right) {
            if (temp.get(i) < temp.get(j)) {
                count += (right - j + 1); // All elements from j to right form pairs with temp[i]
                list.set(k++, temp.get(i++));
            } else {
                list.set(k++, temp.get(j++));
            }
        }

        while (i <= mid) list.set(k++, temp.get(i++));
        while (j <= right) list.set(k++, temp.get(j++));
        return count;
    }
}
