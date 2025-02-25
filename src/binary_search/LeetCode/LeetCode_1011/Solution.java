package binary_search.LeetCode.LeetCode_1011;

class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int min = 0;

        for(int i=0; i<weights.length; i++){

            max +=weights[i];
            min = Math.max(min,weights[i]);
        }
        int s = min, e = max;
        while(s <= e){
            int m = (s+e)/2;
            int num = findDays(weights,m);
            if( num <= days){
                e = m-1;
            }else{
                s = m+1;
            }
        }

        return s;
    }

    public  int findDays(int[] weights, int cap) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }
}
