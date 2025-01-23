package linked_Lists.GFG.Search_in_Linked_List;

//TC - O(N), SC - O(1)

class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node temp = head;

        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
}
