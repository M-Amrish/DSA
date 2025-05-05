package two_pointer.scaler.Another_Count_Rectangles;

public class Solution {
    public class Solution {
        public int solve(int[] A, int B) {
            int n = A.length;
            int mod = 1000000007;
            int i=0, j = A.length-1;
            long ans =0;

            if(n==1 && A[0]*A[0]<B)
                return 1;
            else if(n==1) return 0;

            while(i <= j){
                long x = A[i], y = A[j];

                if( x*y < B){
                    ans = ans + (2L*(j-i)+1);
                    ans = ans % mod;
                    i++;
                }else{
                    j--;
                }
            }
            return (int)ans%mod;
        }
    }

}
