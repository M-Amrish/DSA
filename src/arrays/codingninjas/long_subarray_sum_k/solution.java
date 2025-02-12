package arrays.codingninjas.long_subarray_sum_k;

// Time Complexity: O(2*N), where N = size of the given array.
// Space Complexity: O(1) as we are not using any extra space.
class Solution {
    public static int longestSubarrayWithSumK(int []a, long k) {

        long sum = a[0];
        int max= 0, i=0, j=0, n = a.length;

        while(j<n){

            while( i<=j && sum > k)
            {
                sum -= a[i];
                i++;
            }

            if(sum == k){
                max = Math.max(max,j-i+1);
            }

            j++;

            if(j<n){
                sum += a[j];
            }
        }

        return max;
    }
}