// Problem Link : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

class Solution {

    TreeNode prev = null;

    public void helper(TreeNode root) {

        if(root == null) return;

        helper(root.right);

        helper(root.left);

        root.right = prev;
        
        root.left = null;

        prev = root;
    }

    public void flatten(TreeNode root) {

        helper(root);
        
    }
}
