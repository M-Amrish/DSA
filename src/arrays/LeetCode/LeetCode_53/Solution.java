package arrays.LeetCode.LeetCode_53;

// A subarray with a sum less than 0 will always reduce our answer
// and so this type of subarray cannot be a part of the subarray with maximum sum.

// TC - O(N), SC - O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}

// Brute force solution

//public static int maxSubarraySum(int[] arr, int n) {
//    int maxi = Integer.MIN_VALUE; // maximum sum
//
//    for (int i = 0; i < n; i++) {
//        int sum = 0;
//        for (int j = i; j < n; j++) {
//            // current subarray = arr[i.....j]
//
//            //add the current element arr[j]
//            // to the sum i.e. sum of arr[i...j-1]
//            sum += arr[j];
//
//            maxi = Math.max(maxi, sum); // getting the maximum
//        }
//    }
//    return maxi;
//}

