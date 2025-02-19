package binary_search.LeetCode.LeetCode_875;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(piles[i], max);
        }


        int s = 0, e = max;

        while(s <= e){

            int m = (s+e)/2;

            int time = calculateTime(piles,m);

            if(time <= h){
                ans = m;

                e = m-1;
            }else{
                s = m+1;
            }

        }

        return ans;
    }


    public static int calculateTime(int[] piles, int k){
        int total = 0;
        for(int i=0; i < piles.length; i++){
            total += Math.ceil((double)piles[i] /(double) k);
        }
        return total;
    }


}
