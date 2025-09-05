// Problem Link : https://leetcode.com/problems/validate-binary-search-tree/description/

class Solution {

    public boolean check(TreeNode root, long min, long max) {

        if(root == null) return true;

        if(min >= root.val || max<= root.val) return false;

        boolean leftSide = check(root.left, min, root.val);

        boolean rightSide = check(root.right, root.val, max);

        if(leftSide == true && rightSide == true) return true;

        return false;
    }

    public boolean isValidBST(TreeNode root) {

        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
}
