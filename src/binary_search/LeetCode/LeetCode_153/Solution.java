package binary_search.LeetCode.LeetCode_153;

class Solution {
    public int findMin(int[] nums) {
        int low = 0, high =nums.length-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int m = (low + high)/2;
            if(nums[low]<=nums[high]){
                ans=Math.min(ans,nums[low]);
                break;
            }
            if(nums[low] <= nums[m]){
                ans = Math.min(ans,nums[low]);
                low = m+1;
            }else{
                ans = Math.min(ans , nums[m]);
                high=m-1;
            }
        }
        return ans;
    }
}