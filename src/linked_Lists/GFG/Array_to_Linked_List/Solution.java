package linked_Lists.GFG.Array_to_Linked_List;

// TC - O(N), SC - O(1)

class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}

class Solution {
    static Node constructLL(int arr[]) {

        if(arr.length == 0)return null;

        Node nn = new Node(arr[0]);
        Node temp = nn;

        for(int i=1;i<arr.length; i++){

            Node temp1 = new Node(arr[i]);
            temp.next = temp1;
            temp = temp1;

        }

        return nn;
    }
}