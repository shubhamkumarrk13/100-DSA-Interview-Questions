// Problem Link : https://leetcode.com/problems/invert-binary-tree/description/

class Solution {

    public TreeNode helper(TreeNode root) {

        if(root == null) return null;

        TreeNode leftSide = helper(root.left);

        TreeNode rightSide = helper(root.right);

        root.left = rightSide;

        root.right = leftSide;

        return root;
    }

    public TreeNode invertTree(TreeNode root) {

        return helper(root);
        
    }
}
