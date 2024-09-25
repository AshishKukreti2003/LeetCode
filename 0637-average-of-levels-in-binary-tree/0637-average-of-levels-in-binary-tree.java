/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double currentLevel = 0;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                currentLevel += currentNode.val;
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            currentLevel= currentLevel/levelSize;
            result.add(currentLevel);
        }
        return result;
    }
}