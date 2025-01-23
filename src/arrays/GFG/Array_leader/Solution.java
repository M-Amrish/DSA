package arrays.GFG.Array_leader;

// TC - O(N), SC - O(1)

import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int max = -1;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] >= max){
                al.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(al);
        return al;
    }
}