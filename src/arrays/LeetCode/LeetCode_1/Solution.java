package arrays.LeetCode.LeetCode_1;
// brute force -- use 2 for loop,
// First, we will use a loop(say i) to select the indices of the array one by one.
// For every index i, we will traverse through the remaining array using another loop(say j)
// to find the other number such that the sum is equal to the target (i.e. arr[i] + arr[j] = target).

// TC - O(N^2), SC - O(1)


// After optimize TC - O(N), SC - O(1)
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                ans[0]=map.get(rem);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }

        return ans;
    }
}
