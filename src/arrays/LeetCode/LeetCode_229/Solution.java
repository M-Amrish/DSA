package arrays.LeetCode.LeetCode_229;

//TC - O(N), SC - O(1).

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int ele1  = 0, ele2 = 0;
        int cnt1 =0, cnt2 = 0;
        int n = nums.length;

        for(int i=0; i<n; i++){

            if(cnt1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                cnt1 = 1;
            }else if(cnt2 == 0 && nums[i] != ele1){
                cnt2 = 1;
                ele2 = nums[i];
            }else if(ele1 == nums[i]){
                cnt1++;
            }else if(ele2 == nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0; cnt2 = 0;

        for(int i=0; i<n; i++){

            if(nums[i] == ele1){
                cnt1++;
            }else if(nums[i] == ele2){
                cnt2++;
            }
        }
        int t = n/3;
        List<Integer> list = new ArrayList<>();

        if(cnt1 > t){
            list.add(ele1);
        }

        if(cnt2 > t){
            list.add(ele2);
        }

        return list;
    }
}