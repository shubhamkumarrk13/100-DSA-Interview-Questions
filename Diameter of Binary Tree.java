// Problem Link : https://leetcode.com/problems/diameter-of-binary-tree/description/

class Solution {

    int result = 0;

    public int solve(TreeNode root) {

        if(root == null) return 0;

        int leftSide = solve(root.left);

        int rightSide = solve(root.right);

        result = Math.max(result, leftSide + rightSide);

        return 1 + Math.max(leftSide, rightSide);
    }

    public int diameterOfBinaryTree(TreeNode root) {

        solve(root);

        return result;
        
    }
}
