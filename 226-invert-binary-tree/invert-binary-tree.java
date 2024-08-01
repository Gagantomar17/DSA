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

    public void swap(TreeNode head){
        TreeNode temp = head.left;
            head.left = head.right;
            head.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        while(!nodeStack.isEmpty()){
            TreeNode current = nodeStack.pop() ;
            swap(current);
            if(current.left!=null){
                nodeStack.push(current.left);
            }
            if(current.right!=null){
                nodeStack.push(current.right);
            }
            
            
        }
        return root ;
    }
}