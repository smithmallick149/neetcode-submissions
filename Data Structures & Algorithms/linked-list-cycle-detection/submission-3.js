/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @return {boolean}
     */
    // hasCycle(head) {
    //     let seen = new Set();
    //     let curr = head;

    //     while(curr){
    //         if(seen.has(curr)){
    //             return true;
    //         }
    //         seen.add(curr);
    //         curr = curr.next;
    //     }
    //     return false;
    // }
    hasCycle(head){
        let slow = head;
        let fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
