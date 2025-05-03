package two_pointer.scaler.Container_With_Most_Water;

public class Solution {
    public int maxArea(int[] A) {
        int n=A.length;
        int l=0, r=n-1, ans=0;
        while(l<r){
            int ht = Math.min(A[l],A[r]);
            int with = r-l;
            int area = ht * with;
            ans = Math.max(area,ans);
            if(A[l]<A[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
