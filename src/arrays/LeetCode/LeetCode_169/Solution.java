package arrays.LeetCode.LeetCode_169;

// Brute force - sort all element and check which element is more or using hashmap find hightest count

// TC - O(N), SC - O(1)
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int ele : nums){

            if(count == 0){
                element = ele;
            }
            if(element == ele){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}