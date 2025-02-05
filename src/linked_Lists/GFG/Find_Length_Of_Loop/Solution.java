package linked_Lists.GFG.Find_Length_Of_Loop;

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class Solution {

    public int countNodesinLoop(Node head) {
        int c=1;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    c+=1;
                }
                return c;
            }
        }
        return 0;
    }
}