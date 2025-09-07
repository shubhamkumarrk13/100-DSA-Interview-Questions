//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/

class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {

        if(inStart > inEnd || postStart > postEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);

        int i = map.get(postorder[postEnd]);

        int leftSize = i - inStart;

        int rightSize = inEnd - i;

        root.left = helper(inorder, postorder, inStart , i - 1, postStart, postStart + leftSize - 1);

        root.right = helper(inorder, postorder, i + 1, inEnd , postEnd - rightSize, postEnd - 1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        int n = inorder.length;

        for(int i=0; i<n; i++) {

            map.put(inorder[i], i);
        }

        TreeNode root = helper(inorder, postorder, 0, n - 1, 0, n - 1);

        return root;
        
    }
}
