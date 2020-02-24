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

    /**
     * 求二叉树的最大深度
     * @param root
     * @return
     */
    private int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth>rightDepth ? leftDepth+1 : rightDepth+1;
    }

    /**
     * 是否为平衡二叉树
     * @param root
     * @return
     */
    private boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        //求左右两个树的高度
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        //如果两树高度相差不超过1并且左右树都为平衡树 ==》平衡树
        return Math.abs(left-right)<=1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }
}

