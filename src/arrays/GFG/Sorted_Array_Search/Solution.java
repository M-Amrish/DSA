package arrays.GFG.Sorted_Array_Search;

class Solution {
    static boolean searchInSorted(int arr[], int k) {

        for(int i=0; i<arr.length; i++){
            // checking the element is equal to K
            if(arr[i] == k){
                return true;
            }
        }

        return false;
    }
}
