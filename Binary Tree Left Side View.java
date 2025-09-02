// Problem Link : https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1

class Solution {
    ArrayList<Integer> leftView(Node root) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        if(root == null) return result;
        
        Queue<Node> q = new LinkedList<>();
        
        q.offer(root);
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            
            for(int i=0; i<size; i++) {
                
                Node node = q.poll();
                
                if(node.left != null) q.offer(node.left);
                
                if(node.right != null) q.offer(node.right);
                
                if(i == 0) result.add(node.data);
            }
        }
        
        return result;
        
    }
}
