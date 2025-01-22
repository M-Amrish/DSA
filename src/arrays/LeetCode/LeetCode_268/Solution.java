package arrays.LeetCode.LeetCode_268;
// TC - O(N), SC - O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // sum of total number
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+nums[i];
        }
        return totalSum - sum;
    }
}