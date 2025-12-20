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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // first brute force

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        queue.offer(root);

        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i=0; i<level; i++){
                TreeNode top = queue.poll();
                subList.add(top.val);

                if(top.left != null){
                    queue.offer(top.left);
                }

                if(top.right != null){
                    queue.offer(top.right);
                }
            }
            ans.add(subList);
        }

        List<List<Integer>> finalAns = new ArrayList<>();

        for(int i=ans.size()-1; i>=0; i--){
            finalAns.add(ans.get(i));
        }
        return finalAns;
    }
}