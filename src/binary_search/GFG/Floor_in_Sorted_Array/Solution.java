package binary_search.GFG.Floor_in_Sorted_Array;

class Solution {
    static int findFloor(int[] arr, int k) {

        int s = 0, e = arr.length-1;
        int result = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if (arr[mid] == k) {
                return mid; // Found exact match
            } else if (arr[mid] < k) {
                result = mid;  // arr[mid] could be the floor value
                s = mid + 1; // Search in the right
            } else {
                e = mid - 1; // Search in the left half
            }
        }
        return result;
    }
}