package binary_search.GFG.Number_of_occurence;


class Solution {
    int countFreq(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == target) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }


        low = 0;
        high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == target) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }


        return first == -1 ? 0 : last - first+1;
    }
}
