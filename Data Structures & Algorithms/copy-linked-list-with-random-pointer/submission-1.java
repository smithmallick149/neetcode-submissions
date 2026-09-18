/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    void insertIntoMap(Node head) {
        Node temp = head;
        while(temp != null) {
            Node nextElement = temp.next;
            Node copy = new Node(temp.val);
            copy.next = nextElement;
            temp.next = copy;
            temp = nextElement;
        }
    }
    void connectRandomPointers(Node head) {
        Node temp = head;
        while(temp != null){
            Node copy = temp.next;
            if(temp.random != null) {
                copy.random = temp.random.next;
            } else {
                copy.random = null;
            }
            temp= temp.next.next;
        }
    }
    Node getDeepCopy(Node head) {
        Node dummy = new Node(-1);
        Node temp = head;
        Node curr = dummy;

        while(temp != null) {
            curr.next = temp.next;
            curr = curr.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }
        return dummy.next;
    }

    public Node copyRandomList(Node head) {
        if(head == null) return head;
        // insert into map as a copy
        insertIntoMap(head);
        // connect the random pointers
        connectRandomPointers(head);
        // create a new list from the copied and random
        return getDeepCopy(head);
    }
}
