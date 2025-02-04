package linked_Lists.LeetCode.LeetCode_142;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

public class Solution {
    public ListNode detectCycle(ListNode head) {

        boolean isCycle = false;
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;

            if(s==f){
                isCycle = true;
                break;
            }
        }

        if(isCycle == false){
            return null;
        }

        s = head;
        while(s != f){
            s = s.next;
            f = f.next;
        }

        return s;
    }
}
