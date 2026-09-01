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
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxvalues = new ArrayList<>();

        if (root == null) {
            return maxvalues;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

         while (!queue.isEmpty()) {
            int nodesatcurrlevel = queue.size();
            int currmaxval = Integer.MIN_VALUE;

            for (int i = 0; i < nodesatcurrlevel; i++) {
                TreeNode currnode = queue.poll();
                
                currmaxval = Math.max(currmaxval,currnode.val); 

                if (currnode.left != null) {
                    queue.add(currnode.left);
                }
                if (currnode.right != null) {
                    queue.add(currnode.right);
                }
            }
            maxvalues.add(currmaxval);
        }

        return maxvalues;
    }
}



