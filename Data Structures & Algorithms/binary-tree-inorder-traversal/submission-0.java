/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     List<Integer> l1;
     public void inOrder(TreeNode root) {
        if(root == null) return;
        if(root.left != null) inOrder(root.left);
        l1.add(root.val);
        if(root.right != null) inOrder(root.right);
     }
    public List<Integer> inorderTraversal(TreeNode root) {
        l1 = new ArrayList<>();
        inOrder(root);
        return l1;
    }
}