// Problem Link : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

class Solution {

    public TreeNode helper(TreeNode root) {

        if(root == null) return null;

        TreeNode leftSide = helper(root.left);

        TreeNode rightSide = helper(root.right);

        root.left = null;

        TreeNode temp = leftSide;

        while(temp != null && temp.right != null) temp = temp.right;

        if(temp != null) temp.right = rightSide;

        if(leftSide != null) root.right = leftSide;

        return root;


    }

    public void flatten(TreeNode root) {

        helper(root);
        
    }
}
