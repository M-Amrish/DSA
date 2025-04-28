package linked_Lists.LeetCode.LeetCode_2;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {

        ListNode head = new ListNode(-1);

        ListNode temp = head;

        int sum =0, carry =0;

        while(A != null || B != null || carry != 0 ){

            sum = carry;

            if( A != null){
                sum += A.val;
                A = A.next;
            }

            if( B != null){
                sum += B.val;
                B = B.next;
            }

            temp.next = new ListNode(sum % 10);

            temp = temp.next;

            carry = sum / 10;
        }

        return  head.next;
    }
}