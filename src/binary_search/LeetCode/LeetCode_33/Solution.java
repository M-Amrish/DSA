package binary_search.LeetCode.LeetCode_33;

class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length-1;

        while(l <= h){
            int m = (h+l)/2;

            if(nums[m] == target){
                return m;
            }

            if(nums[l] <= nums[m]){
                if( nums[l] <= target && target <= nums[m]){
                    h = m-1;
                }else{
                    l = m+1;
                }
            }else{
                if(nums[m] <= target && target <= nums[h]){
                    l = m+1;
                }else{
                    h = m-1;
                }
            }
        }
        return -1;
    }
}
