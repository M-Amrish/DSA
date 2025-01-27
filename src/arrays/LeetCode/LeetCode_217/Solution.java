package arrays.LeetCode.LeetCode_217;

// brute force -- using 2 loop, one loop will pick integer one by one and
// second loop will check if there exists any duplicate or not  TC - O(N*N), SC - O(1).

// better solution -- we can sort the array and check if there is any exists
// adjacent or neighboring elements whether they are the same or not. TC - O(N*log N) SC - O(1).

// optimize solution -- using hashset, after inserting in set, check the set size and array size.
// if both size are equal then false or true. TC - O(N), SC -O(N).

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<size; i++){
            hs.add(nums[i]);
        }
        if(hs.size() == size) return false;

        return true;

    }
}