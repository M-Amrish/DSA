package two_pointer.LeetCode.LeetCode_1004;

// better solution O(N) Time, O(1) Space

//    class Solution {
//        public int longestOnes(int[] nums, int k) {
//            int left = 0, maxLength = 0, zeroCount = 0;
//            for (int right = 0; right < nums.length; ++right) {
//                if (nums[right] == 0) {
//                    zeroCount++;
//                }
//                while (zeroCount > k) {
//                    if (nums[left] == 0) {
//                        zeroCount--;
//                    }
//                    left++;
//                }
//                maxLength = Math.max(maxLength, right - left + 1);
//            }
//            return maxLength;
//        }
//    }

// optimized solution O(N) Time, O(1) Space - Sliding Window Approach - Two Pointers Approach
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0, r=0, max = 0, zero = 0;

        while(r < nums.length){

            if(nums[r] == 0){
                zero++;
            }
            if(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            if(zero <= k){
                max = Math.max(max, r-l+1);

            }
            r++;
        }
        return max;
    }


}
