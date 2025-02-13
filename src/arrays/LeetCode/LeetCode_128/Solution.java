package arrays.LeetCode.LeetCode_128;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int num : set){
            if( !set.contains(num-1)){
                int currentNum = num;
                int cnt = 1;
                while( set.contains(currentNum + 1)){
                    currentNum++;
                    cnt++;
                }

                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}