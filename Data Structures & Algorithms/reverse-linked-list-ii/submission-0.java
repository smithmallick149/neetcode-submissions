/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next= head;
        ListNode prev = dummy;

        for(int i=0;i < left - 1;i++) {
            prev = prev.next;
        }
        ListNode subListHead = prev.next;
        ListNode subListTail = subListHead;
        for(int i=0;i < right - left;i++) {
            subListTail = subListTail.next;
        }
        ListNode nextNode = subListTail.next;
        subListTail.next = null;
        prev.next = reverseList(subListHead);
        subListHead.next = nextNode;
        return dummy.next;
    }
}