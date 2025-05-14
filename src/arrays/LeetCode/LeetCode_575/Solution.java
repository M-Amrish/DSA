package arrays.LeetCode.LeetCode_575;

import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i : candyType){
            hs.add(i);
        }

        int n = candyType.length/2;

        if(hs.size() >= n){
            return n;
        }else{
            return hs.size();
        }
    }
}
