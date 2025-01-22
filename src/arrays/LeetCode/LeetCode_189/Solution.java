package arrays.LeetCode.LeetCode_189;

class Solution {
    // reverse Entired array and reverse the k elements and reverse remaing elements
    // TC - O(N), SC - O(N)

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    // reverse the given array
    public void reverse(int a[], int l, int r){
        while(l <= r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;
            r--;
        }
    }
}