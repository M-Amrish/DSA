package two_pointer.LeetCode.LeetCode_532;

import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, i=0, j=1, c=0;

        while(j<n){
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {
                c++;
                int x = nums[i], y = nums[j];
                while (i < n && nums[i] == x) i++;
                while (j < n && nums[j] == y) j++;
            }
        }
        return c;
    }
}


