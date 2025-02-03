package linked_Lists.LeetCode.LeetCode_237;

// TC - O(1), SC - O(1).

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        temp.val = temp.next.val;
        temp.next = temp.next.next;

    }
}