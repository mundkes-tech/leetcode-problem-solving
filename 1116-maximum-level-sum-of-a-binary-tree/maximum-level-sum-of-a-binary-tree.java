import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0; 
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int maxsum = Integer.MIN_VALUE;
        int currlevel = 1;
        int maxlevel = 1;

        while (!queue.isEmpty()) {
            int nodesatcurrlevel = queue.size();
            int currlevelsum = 0;
            
            for (int i = 0; i < nodesatcurrlevel; i++) {
                TreeNode currnode = queue.poll();
                
                currlevelsum += currnode.val; 

                if (currnode.left != null) {
                    queue.add(currnode.left);
                }
                if (currnode.right != null) {
                    queue.add(currnode.right);
                }
            }

            if (currlevelsum > maxsum) {
                maxsum = currlevelsum;
                maxlevel = currlevel;
            }

            currlevel++;
        }

        return maxlevel;
    }
}
