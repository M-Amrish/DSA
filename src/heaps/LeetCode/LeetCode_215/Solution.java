package heaps.LeetCode.LeetCode_215;

import java.util.PriorityQueue;
// Optimal Solution TC - O(NlogK), SC - O(K).

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n : nums){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }
}

// Brute Force Solution TC - O(NlogN), SC - O(1).

//    public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length-k];
//    }