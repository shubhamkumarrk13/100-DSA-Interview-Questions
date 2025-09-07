// Problem Link : https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

class Solution {

    Map<Integer, Integer> map = new HashMap<>(); // For storing the indexes of inorder array

    int ind = 0;

    public TreeNode helper(int[] preorder, int[] inorder, int inorderStart, int inorderEnd) {

        if(inorderStart > inorderEnd) return null;
 
        TreeNode root = new TreeNode(preorder[ind]);

        int i = map.get(preorder[ind]);

        ind++;

        root.left = helper(preorder, inorder, inorderStart, i - 1);

        root.right = helper(preorder, inorder, i + 1, inorderEnd);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0; i<inorder.length; i++) {

            map.put(inorder[i], i);
        }

        TreeNode root = helper(preorder, inorder, 0, inorder.length - 1);

        return root;
        
    }
}
