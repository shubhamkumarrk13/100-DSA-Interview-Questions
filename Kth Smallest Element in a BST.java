// Problem Link : https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

class Solution {

    public void inorder(TreeNode root, int[] arr, int k) {

        if(root == null) return;

        inorder(root.left, arr, k);

        arr[1]++;

        if(arr[1] == k) arr[0] = root.val;

        inorder(root.right, arr, k);
    }



    public int kthSmallest(TreeNode root, int k) {

        int[] arr = new int[2];
        
        //arr[0] = contains result; and arr[1] is counter

        inorder(root, arr, k);

        return arr[0];
    }
}
