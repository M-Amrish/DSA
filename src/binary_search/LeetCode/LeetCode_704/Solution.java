package binary_search.LeetCode.LeetCode_704;

// Optimal solution
// SC - O(LogN), TC - O(1).

class Solution {
    public int search(int[] nums, int target) {
        int e=0, l=nums.length-1;

        while(e<=l){
            int mid  = (e+l)/2;
            if( nums[mid] == target){

                return mid;
            }else if(nums[mid] > target){

                l = mid -1;
            }else{
                e = mid +1;
            }
        }

        return -1;
    }
}