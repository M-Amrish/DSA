package arrays.LeetCode.LeetCode_136;
// TC - O(N), SC - O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){
            xor  = xor ^ nums[i];
        }

        return xor;
    }
}