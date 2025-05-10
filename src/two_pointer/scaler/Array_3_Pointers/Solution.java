package two_pointer.scaler.Array_3_Pointers;
// brute force solution TC - O(N*N), SC - O(1).
//    public int minimize(final int[] A, final int[] B, final int[] C) {
//        int min=Integer.MAX_VALUE;
//        for(int i=0;i<A.length;i++){
//            for(int j=0;j<B.length;j++){
//                for(int k=0;k<C.length;k++){
//                    int max=Math.max(Math.abs(A[i]-B[j]),Math.max(Math.abs(B[j]-C[k]),Math.abs(A[i]-C[k])));
//                    min=Math.min(min,max);
//                }
//            }
//        }
//        return min;
//    }


// Optimal Solution TC - O(N), SC - O(1).


public class Solution {

    public int minimize(final int[] A, final int[] B, final int[] C) {
        int i=0,j=0,k=0;
        int min=Integer.MAX_VALUE;
        //loop until on of the pointer reaches the end of its array
        while(i<A.length && j<B.length && k<C.length){

            int max=Math.max(Math.abs(A[i]-B[j]),Math.max(Math.abs(B[j]-C[k]),Math.abs(A[i]-C[k])));
            min=Math.min(min,max);
            // If all values are equal, return 0 (as it's the minimum possible difference)
            if (A[i] == B[j] && B[j] == C[k]) {
                return 0;
            }
            //move the pointers to the smallest value forward.This is done because the smallest value is most likely
            //to be the one contributing to the largest difference,moving it might bring the overall differences
            //closer together
            if(A[i]<=B[j] && A[i]<=C[k]){
                i++;
            }
            else if(B[j]<=A[i] && B[j]<=C[k]){
                j++;

            }else{

                k++;
            }
        }
        return min;
    }
}

