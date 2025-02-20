package binary_search.LeetCode.LeetCode_1482;


class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long)m*k;
        if(val > n){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }

        int l = min;
        int h = max;

        while(l<=h){
            int mid =(l+h)/2;
            if(fun(bloomDay,m,k,mid) == true){

                h=mid -1;
            }else{
                l=mid +1;
            }
        }
        return l;
    }


    public boolean fun(int[] a, int m, int k, int day){
        int cnt =0, ans = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]<=day){
                cnt++;
            }else{
                ans += (cnt/k);
                cnt=0;
            }
        }

        ans += (cnt/k);

        return ans>=m;
    }
}