package arrays.LeetCode.LeetCode_152;

// By using two loop find the max product of subarray.
// TC - O(N*N), SC - O(1).

//      int result = arr[0];
//	        for(int i=0;i<arr.length-1;i++) {
//              int p = arr[i];
//	        for(int j=i+1;j<arr.length;j++) {
//              result = Math.max(result,p);
//              p *= arr[j];
//              }
//          result = Math.max(result,p);
//	    }
//      return result;

// Optimal Solution
// TC - O(N), SC - O(1).
class Solution {
    public int maxProduct(int[] nums) {

        int pre = 1, suff = 1;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++ ){

            if(pre == 0) pre = 1;

            if(suff == 0) suff = 1;

            pre = pre * nums[i];
            suff = suff * nums[nums.length -i-1];

            max = Math.max(max,Math.max(pre,suff));
        }

        return max;
    }
}