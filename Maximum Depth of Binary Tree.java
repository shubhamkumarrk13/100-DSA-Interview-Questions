// Problem Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

class Solution {

    public int helper(TreeNode root) {

        if(root == null) return 0;

        int leftHeight = helper(root.left);

        int rightHeight = helper(root.right);

        int totalHeight = 1 + Math.max(leftHeight, rightHeight);

        return totalHeight;
    }

    public int maxDepth(TreeNode root) {
        
        int maxHeight = helper(root);

        return maxHeight;
    }
}
