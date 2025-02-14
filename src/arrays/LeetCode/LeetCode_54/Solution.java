package arrays.LeetCode.LeetCode_54;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = m-1, top = 0, bottom = n-1;

        while(left <= right && top <= bottom){
            // left to right
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            // top to bottom
            for(int i=top; i <= bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                //right to left
                for(int i=right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                // bottom to top
                for(int i=bottom; i>=top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}