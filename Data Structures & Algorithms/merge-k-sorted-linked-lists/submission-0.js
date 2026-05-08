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
     * @param {ListNode[]} lists
     * @return {ListNode}
     */
    mergedLists(l1, l2){
        if(!l1){
            return l2
        }
        if(!l2) return l1
        if(l1.val <= l2.val){
            l1.next = this.mergedLists(l1.next, l2)
            return l1
        } else {
            l2.next = this.mergedLists(l1, l2.next)
            return l2
        }
    }
  mergeKLists(lists) {
        if (lists.length === 0) return null; 

    while (lists.length > 1) {
        let listData = [];

        for (let i = 0; i < lists.length; i += 2) {  // Fix: i += 2
            let l1 = lists[i];
            let l2 = i + 1 < lists.length ? lists[i + 1] : null;
            listData.push(this.mergedLists(l1, l2));
        }

        lists = listData; // Update lists after each merging round
    }
    return lists[0]; // Final merged list
}
}
