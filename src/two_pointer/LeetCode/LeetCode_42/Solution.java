package two_pointer.LeetCode.LeetCode_42;

// Approach 3: Two-Pointer Approach (O(N) Time, O(1) Space)
class Solution {
    public int trap(int[] A) {

        int lmax = 0, rmax = 0, ans = 0, l=0, r = A.length-1;

        while(l < r){
            lmax = Math.max(lmax,A[l]);
            rmax = Math.max(rmax,A[r]);

            if(lmax < rmax){
                ans += lmax - A[l];
                l++;
            }else{
                ans += rmax - A[r];
                r--;
            }

        }
        return ans;

    }
}
//// Approach 2: Optimized Space with a Single Right Max Variable (O(N) Time, O(N) Space)
//class Solution {
//    public int trap(int[] arr) {
//        int n = arr.length;
//        int[] lmax = new int[n];
//        lmax[0] = arr[0];
//
//        // Compute left max array
//        for (int i = 1; i < n; i++)
//            lmax[i] = Math.max(lmax[i - 1], arr[i]);
//
//        int rmax = arr[n - 1], ans = 0;
//
//        // Compute trapped water while updating right max dynamically
//        for (int i = n - 1; i >= 0; i--) {
//            rmax = Math.max(rmax, arr[i]);
//            ans += Math.min(lmax[i], rmax) - arr[i];
//        }
//        return ans;
//    }
//}


//// Approach 1: Precompute Left and Right Max Arrays (O(N) Time, O(N) Space)
//class Solution {
//    public int trap(int[] arr) {
//        int n = arr.length;
//        int[] lmax = new int[n];
//        lmax[0] = arr[0];
//        for (int i = 1; i < n; i++)
//            lmax[i] = Math.max(lmax[i - 1], arr[i]);
//
//        int[] rmax = new int[n];
//        rmax[n - 1] = arr[n - 1];
//        for (int i = n - 2; i >= 0; i--)
//            rmax[i] = Math.max(rmax[i + 1], arr[i]);
//
//        int ans = 0;
//        for (int i = 0; i < n; i++)
//            ans += Math.min(lmax[i], rmax[i]) - arr[i];
//
//        return ans;
//    }
//}

