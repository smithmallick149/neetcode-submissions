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
    // mergeKLists(lists) {
    //     let nodes = [];
    //     for(let ls of lists) {
    //         while(ls){
    //             nodes.push(ls.val);
    //             ls = ls.next;
    //         }
    //     }
    //     nodes.sort((a, b) => a - b);

    //     let res = new ListNode(0);
    //     let curr =res;
    //     for(let node of nodes){
    //         curr.next = new ListNode(node);
    //         curr = curr.next;
    //     }
    //     return res.next;
    // }
    mergeKLists(lists){
        if(lists.length === 0) return null;
        const minHeap = new MinPriorityQueue((x)=> x.val);
        for(let list of lists){
            if(list != null) minHeap.enqueue(list);
        }

        let res = new ListNode(0);
        let curr = res;
        while(minHeap.size() > 0){
            let node = minHeap.dequeue();
            curr.next = node;
            curr = curr.next;

            node = node.next;
            if(node != null) {
                minHeap.enqueue(node)
            }
        }
        return res.next;
    }
}
