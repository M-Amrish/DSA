package arrays.GFG.Longest_Subarray_with_given_Sum_K_Positive;

// Using two loops
// TC - O(N*N), SC - O(1).

//public static int getLongestSubarray(int []a, long k) {
//    int n = a.length; // size of the array.
//
//    int len = 0;
//    for (int i = 0; i < n; i++) { // starting index
//        long s = 0; // Sum variable
//        for (int j = i; j < n; j++) { // ending index
//            // add the current element to
//            // the subarray a[i...j-1]:
//            s += a[j];
//
//            if (s == k)
//                len = Math.max(len, j - i + 1);
//        }
//    }
//    return len;
//}



// Optimal solution
// TC - O(N), SC - O(1).
import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length; // size of the array.

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += arr[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}

