// Problem Link : https://leetcode.com/problems/binary-tree-right-side-view/description/

class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()) {

            int size = q.size();

            while(size > 0) {

                TreeNode node = q.poll();

                size--;

                if(node.left != null) q.offer(node.left);

                if(node.right != null) q.offer(node.right);

                if(size == 0) result.add(node.val);
            }
        }

        return result;
        
    }
}
