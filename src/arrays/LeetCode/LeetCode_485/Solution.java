package arrays.LeetCode.LeetCode_485;
// TC - O(N), SC - O(1)

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int cnt = 0;

        for(int i=0; i<n; i++){

            if(nums[i] == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            max = Math.max(max,cnt);
        }

        return max;

    }
}
