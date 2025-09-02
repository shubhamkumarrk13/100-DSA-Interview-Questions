// Problem Link : https://leetcode.com/problems/binary-tree-level-order-traversal/description/

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()) {

            int size = q.size();

            List<Integer> temp = new ArrayList<>();

            for(int i=0; i<size; i++) {

                TreeNode node = q.poll();

                if(node.left != null) q.offer(node.left);

                if(node.right != null) q.offer(node.right);

                temp.add(node.val);
            }

            result.add(new ArrayList<>(temp));
        }

        return result;
        
    }
}
