package two_pointer.LeetCode.LeetCode_3;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        for(int r=0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r-l+1);
        }

        return max;
    }
}