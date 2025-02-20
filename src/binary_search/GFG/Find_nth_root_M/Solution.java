package binary_search.GFG.Find_nth_root_M;

class Solution {
    public int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        int ans = 1;
        while(low<=high){

            int mid = (low+high)/2;
            if(Math.pow(mid,n) == m){
                return mid;
            }else if(Math.pow(mid,n) < m){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
