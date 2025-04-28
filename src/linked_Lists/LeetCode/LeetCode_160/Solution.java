package linked_Lists.LeetCode.LeetCode_160;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if(A == null || B == null){
            return null;
        }

        ListNode t1 = A;
        ListNode t2 = B;

        while(t1 != t2){

            if(t1 != null){
                t1 = t1.next;
            }else{
                t1 = B;
            }

            if(t2 != null){
                t2 = t2.next;
            }else{
                t2 = A;
            }
        }

        return t1;
    }
}
