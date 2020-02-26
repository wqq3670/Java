import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-26
 * Time: 14:21
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
        int leftLen = maxDepth(root.left);
        int rightLen = maxDepth(root.right);

        return Math.abs(leftLen - rightLen) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    /**
     * 是否为对称二叉树
     * @param root
     * @return
     */
    private boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
    private boolean isSymmetricChild(TreeNode leftroot,TreeNode rightroot) {
        if(leftroot == null && rightroot == null) {
            return true;
        }
        if(leftroot==null&&rightroot!=null || leftroot!=null&&rightroot==null) {
            return false;
        }
        return leftroot.val == rightroot.val
                && isSymmetricChild(leftroot.left,rightroot.right)
                &&isSymmetricChild(leftroot.right,rightroot.left);
    }

    /**
     * 二叉树前序遍历（递归）
     * @param root
     * @return
     */
    private List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    /**
     * 二叉树前序遍历（非递归）==》栈
     * @param root
     * @return
     */
    private List<Integer> preorderTraversalNor(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                list.add(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            //cur为空
            cur = stack.pop();
            cur = cur.right;
        }
        return list;
    }

    /**
     * 二叉树中序遍历（递归）
     * @param root
     * @return
     */
    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
    /**
     * 二叉树中序遍历（非递归）==》栈
     * @param root
     * @return
     */
    private List<Integer> inorderTraversalNor(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }

    /**
     * 二叉树后序遍历（递归）
     * @param root
     * @return
     */
    private List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }
    /**
     * 二叉树后序遍历（非递归）==》栈
     * @param root
     * @return
     */
    private List<Integer> postorderTraversalNor(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;



    }

}
