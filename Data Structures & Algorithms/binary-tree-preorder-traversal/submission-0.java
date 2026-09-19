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
    public void preOrder(TreeNode root) {
        if(root == null) return;
        l1.add(root.val);
        if(root.left != null) preOrder(root.left);
        if(root.right != null) preOrder(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        l1 = new ArrayList<>();
        preOrder(root);
        return l1;
    }
}