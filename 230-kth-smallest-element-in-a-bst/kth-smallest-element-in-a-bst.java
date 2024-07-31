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
    public int kthSmallest(TreeNode root, int k) {
        int count = 0 ;
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root ;
        TreeNode smallest = null ;
        while( (current!=null || !st.isEmpty()) && k!=count ){
            while(current != null){
                st.push(current) ;
                current = current.left ;
            }
            count++ ;
            smallest = st.pop();
            current = smallest.right ;

        }
        return smallest.val ;
    }
}