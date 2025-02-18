package binary_search.LeetCode.LeetCode_540;

class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n=nums.length;
        if(n == 1 ){
            return nums[0];
        }
        if(nums[0] != nums[1]){return nums[0];}

        if(nums[n-1] != nums[n-2]){return nums[n-1];}


        int low = 1, high = n-2;
        while(low <= high){
            int m = (low+high)/2;

            if(nums[m] != nums[m-1] && nums[m] != nums[m+1]){
                return nums[m];
            }

            if(nums[m] == nums[m-1]){
                m=m-1;
            }
            if(m%2 == 0){
                low=m+2;
            }else{
                high = m-1;
            }
        }
        return -1;
    }
}