package heaps.LeetCode.LeetCode_23;

import java.util.PriorityQueue;

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 // Optimal Solution TC - O(NlogK), SC - O(K) .
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>( (a, b) -> a.val -b.val);

        for(ListNode n : lists){
            if( n != null) priorityQueue.add(n);
        }

        ListNode nn= new ListNode(-1);
        ListNode curr = nn;

        while (priorityQueue.size() > 0){

            curr.next = priorityQueue.remove();
            curr = curr.next;

            if(curr.next != null){
                priorityQueue.add(curr.next);
            }

        }
        return nn.next;

    }
}

// Brute Force Solution TC - O(NKlogK), SC - O(K).

//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) {
//            return null;
//        }
//        return merge(lists, 0, lists.length - 1);
//    }
//
//    private ListNode merge(ListNode[] lists, int start, int end) {
//        if (start == end) {
//            return lists[start];
//        }
//        int mid = (start + end) / 2;
//        ListNode left = merge(lists, start, mid);
//        ListNode right = merge(lists, mid + 1, end);
//        return mergeTwoLists(left, right);
//    }

