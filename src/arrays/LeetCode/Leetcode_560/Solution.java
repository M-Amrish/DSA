package arrays.LeetCode.Leetcode_560;

// Optimal solution
// TC - O(N), O(1).


import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        int psum = 0;
        int sum =0;
        int cnt = 0;

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<n; i++){
            psum += nums[i];

            sum = psum - k;

            if(map.containsKey(sum)){
                cnt += map.get(sum);
            }

            if(map.containsKey(psum)){
                map.put(psum, map.get(psum)+1);
            }else{
                map.put(psum,1);
            }
        }

        return cnt;

    }
}
