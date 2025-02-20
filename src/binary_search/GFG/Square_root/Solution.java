package binary_search.GFG.Square_root;

class Solution {
    int floorSqrt(int n) {
        int low = 0;
        int high = n - 1;
        int ans = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
