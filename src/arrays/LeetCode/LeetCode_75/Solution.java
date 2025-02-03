package arrays.LeetCode.LeetCode_75;

//Brute Force Solution
// TC - O(2N), SC - O(1).

// OptimalSolution
// TC - O(N), SC - O(1).
class  Solution {
public void sortColors(int[] nums) {
    int low =0, mid  = 0, high = nums.length-1;

    while(mid <= high){

        if(nums[mid] == 0){
            swap(nums,low, mid);
            low++;
            mid++;
        }else if(nums[mid] == 1){
            mid++;
        }else if(nums[mid] == 2){
            swap(nums,high, mid);
            high--;
        }
    }
}
public void swap(int A[], int i, int j){
    int tmp = A[i];
    A[i] = A[j];
    A[j] = tmp;
}
}