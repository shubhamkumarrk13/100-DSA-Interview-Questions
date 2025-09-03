// Problem Link : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();

        boolean leftToRight = true;

        q.offer(root);

        while(!q.isEmpty()) {

            int size = q.size();

            Deque<Integer> temp = new LinkedList<>();

            for(int i=0; i<size; i++) {

                TreeNode node = q.poll();

                if(leftToRight) temp.addLast(node.val);

                else temp.addFirst(node.val);

                if(node.left != null) q.offer(node.left);

                if(node.right != null) q.offer(node.right);
            }

            result.add(new ArrayList<>(temp));

            leftToRight = !leftToRight;
        }

        return result;
        
    }
}
