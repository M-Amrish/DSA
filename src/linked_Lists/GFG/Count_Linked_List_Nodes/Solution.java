package linked_Lists.GFG.Count_Linked_List_Nodes;

class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

class Solution {
    public int getCount(Node head) {
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }

        return count;
    }
}