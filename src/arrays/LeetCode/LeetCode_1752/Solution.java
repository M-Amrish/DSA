package arrays.LeetCode.LeetCode_1752;

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int c = 0;

        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1)%n]){
                c++;
            }
        }
        // c greater than 1 return false
        if(c>1){
            return false;
        }

        return true;
    }
}