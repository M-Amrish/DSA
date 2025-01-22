package arrays.LeetCode.LeetCode_283;
// TC - O(N), SC - O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;

        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }

        if( j == -1){

        } else{
            for(int i=j+1; i<nums.length; i++){
                if(nums[i] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }

    }
}