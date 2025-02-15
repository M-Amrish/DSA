package arrays.GFG.Maximum_Score_from_Subarray_Minimums;

class Solution {
    public int pairWithMaxSum(int arr[]) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i =0 ; i<n-1;i++){
            int sum = arr[i] + arr[i+1];
            if(sum> max){
                max=sum;
            }
        }
        return max;
    }
}
