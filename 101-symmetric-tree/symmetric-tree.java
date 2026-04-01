
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetriccheck(root.left,root.right);
    }

    private boolean isSymmetriccheck(TreeNode left,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }

        if(left.val!=right.val){
            return false;
        }

        return isSymmetriccheck(left.left,right.right)
               &&
               isSymmetriccheck(left.right,right.left);
    }
}