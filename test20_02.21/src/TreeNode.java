/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-21
 * Time: 15:06
 **/

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    private int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
    }

    private boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.abs(left - right) <= 1
                && isBalanced(root.right) && isBalanced(root.right);
    }
	public boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
        if(leftTree == null && rightTree == null) {
            return true;
        }
        if(leftTree == null && rightTree != null || leftTree != null && rightTree == null) {
            return false;
        }
        return leftTree.val == rightTree.val && isSymmetricChild(leftTree.left,rightTree.right) 
        && isSymmetricChild(leftTree.right,rightTree.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);   
    }
}

