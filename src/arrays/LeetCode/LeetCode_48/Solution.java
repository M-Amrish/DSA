package arrays.LeetCode.LeetCode_48;
// TC - O(N*N)+O(N*N), SC - O(1)

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int temp = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++){
            int l=0, r=matrix.length-1;
            while(l <= r){
                temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }
}