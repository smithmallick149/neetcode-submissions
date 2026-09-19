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
    public void postOrder(TreeNode root) {
        if(root == null) return;
        if(root.left != null) postOrder(root.left);
        if(root.right != null) postOrder(root.right);
        l1.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        l1 = new ArrayList<>();
        postOrder(root);
        return l1;
    }
}