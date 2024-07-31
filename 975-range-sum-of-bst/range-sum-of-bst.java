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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0 ;
        TreeNode current = root ;
        Stack<TreeNode> st = new Stack<>() ;
        while( current!=null || !st.isEmpty() ){
            while(current!=null ){
                st.push(current) ;
                current = current.left ;
            }
            current = st.pop() ;
            if(current.val >= low && current.val <= high){
                sum += current.val ;
            }
            current = current.right ;


        }
        return sum ;
    }
}