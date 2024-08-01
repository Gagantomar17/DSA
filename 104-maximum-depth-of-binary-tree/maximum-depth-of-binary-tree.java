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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
        // if(root == null) return 0 ;
        // Stack<TreeNode> nodeStack = new Stack<>() ;
        // Stack<Integer> depthStack = new Stack<>() ;
        
        // nodeStack.push(root);
        // depthStack.push(1);
        // int depth = 0 ;

        // while(!nodeStack.isEmpty()){
        //     TreeNode current = nodeStack.pop();
        //     int currDepth = depthStack.pop() ;
        //     if(current !=null){
        //         depth = (currDepth > depth)? currDepth : depth;

        //         if(current.right != null){
        //             nodeStack.push(current.right);
        //             depthStack.push(currDepth + 1);
        //         }

        //         if(current.left != null){
        //             nodeStack.push(current.left);
        //             depthStack.push(currDepth + 1);
        //         }



        //     }
        // }
        // return depth ;
        
    }
}