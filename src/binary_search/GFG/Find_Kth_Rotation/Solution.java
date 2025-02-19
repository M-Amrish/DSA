package binary_search.GFG.Find_Kth_Rotation;

import java.util.List;

class Solution {
    public int findKRotation(List<Integer> nums) {
        int low = 0, high =nums.size()-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high){
            int m = (low + high)/2;

            if(nums.get(low) <= nums.get(high)){

                if (nums.get(low) < ans) {
                    index = low;
                    ans = nums.get(low);
                }
                break;
            }

            if(nums.get(low) <= nums.get(m)){
                if (nums.get(low) < ans) {
                    index = low;
                    ans = nums.get(low);
                }
                low = m+1;
            }else{
                if (nums.get(m) < ans) {
                    index = m;
                    ans = nums.get(m);
                }
                high=m-1;
            }
        }
        int k = 0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) < ans){
                k++;
            }
        }
        return k;
    }
}
