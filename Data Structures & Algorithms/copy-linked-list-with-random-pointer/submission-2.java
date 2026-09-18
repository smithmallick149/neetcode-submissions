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
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        map.put(null, null);
        Node temp = head;
        while(temp != null) {
            if(!map.containsKey(temp)) {
                map.put(temp, new Node(0));
            }
            map.get(temp).val = temp.val;
            if(!map.containsKey(temp.next)) {
                map.put(temp.next, new Node(0));
            }
            map.get(temp).next = map.get(temp.next);
            if(!map.containsKey(temp.random)) {
                map.put(temp.random, new Node(0));
            }
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
