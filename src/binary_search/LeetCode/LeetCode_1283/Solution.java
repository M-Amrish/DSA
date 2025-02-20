package binary_search.LeetCode.LeetCode_1283;


class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0; i<n; i++){
            max  = Math.max(nums[i],max);
        }
        int s = 0, e = max;

        while(s <= e){
            int m = (s+e)/2;

            int a = fun(nums,m);

            if( a<= threshold){
                ans  = m;
                e = m-1;
            }else{
                s = m+1;
            }
        }

        return ans;
    }

    public int fun(int [] a, int t){

        int ans = 0;

        for(int i=0; i<a.length; i++){
            ans += Math.ceil((double)a[i]/(double)(t));
        }

        return ans;
    }
}