// Problem Link : https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

class Solution {

    int result = Integer.MAX_VALUE;

    int prev = -1;

    public void inorder(TreeNode root) {

        if(root == null) return;

        inorder(root.left);

        if(prev != -1) {

            int diff = Math.abs(root.val - prev);

            result = Math.min(result, diff);
        }

        prev = root.val;

        inorder(root.right);
    }

    public int getMinimumDifference(TreeNode root) {

        inorder(root);

        return result;
        
    }
}
