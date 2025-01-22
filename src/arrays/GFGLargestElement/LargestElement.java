package arrays.GFGLargestElement;

/*
Largest Element in Array

Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
 */
public class LargestElement {
    public static int largest(int[] arr) {

        // brute force
        // sort the array and check at last postion
        //TC - N*Log(N) & SC - 1

        int var = -1;

        for(int i=0 ; i<arr.length; i++){

            if(arr[i] > var){
                var = arr[i];
            }
        }

        return var;
    }
}
