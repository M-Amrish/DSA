package binary_search.LeetCode.LeetCode_34;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = {-1,-1};

        int s=0;
        int e=nums.length-1;

        while(s<=e){
            int m = (s+e)/2;

            if(nums[m] == target){
                ans[0]=m;
                e=m-1;
            }else if(nums[m] > target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        s=0;
        e=nums.length-1;
        while(s<=e){
            int m = (s+e)/2;

            if(nums[m] == target){
                ans[1]=m;
                s=m+1;
            }else if(nums[m] > target){
                e=m-1;
            }else{
                s=m+1;
            }
        }

        return ans;

    }
}
