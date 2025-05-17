package greedy.LeetCode.LeetCode_135;

import java.util.Arrays;
// Greedy :- how to find the maximum number of candies you can eat.
// TC - O(N), SC - O(N).

class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;
        int sum = 0;

        int a[] = new int[n];
        Arrays.fill(a,1);

        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                a[i] = a[i-1]+1;
            }
        }

        for(int i=n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                a[i] = Math.max(a[i], a[i+1]+1);
            }
        }

        for(int i=0; i<n; i++){
            sum += a[i];
        }

        return sum;
    }
}
