package linked_Lists.LeetCode.LeetCode_206;
// Brute force Solution
//  We can use a stack for this. By pushing each node onto the stack as we move through the list,
//  we effectively reverse the order of the nodes. Once all the nodes are stored in the stack,
// TC - O(2N), SC - O(N).

// Optimal Solution
// using two variable
// TC - O(N), SC - O(1).

//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while( curr != null){
            ListNode fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        head = prev;
        return head;
    }
}