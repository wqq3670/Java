import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        //两个子树都为空的情况
        if(leftroot == null && rightroot == null) {
            return true;
        }
        //两个子树只有一个为空的情况
        if((leftroot==null&&rightroot!=null) || (leftroot!=null&&rightroot==null)) {
            return false;
        }
        //对应值相等 并且 左树的左=右树的右  左树的右=右树的左
        return leftroot.val == rightroot.val
                && isSymmetricChild(leftroot.left,rightroot.right)
                && isSymmetricChild(leftroot.right,rightroot.left);
    }

    /**
     * 二叉树前序遍历（递归）
     * @param root
     * @return
     */
    private List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return null;
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
        //标志一个cur
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                list.add(cur.val);
                cur = cur.left;
            }
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
            return null;
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
            return null;
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
        TreeNode prev = null;//代表刚刚弹出的节点
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();//cur等于栈顶元素但不弹出
            if(cur.right == null || cur.right == prev) {
                //cur.right为空 或者 cur.right 是刚刚已经弹出的元素
                stack.pop();
                list.add(cur.val);//弹出并记录
                prev = cur;
                cur = null;
            }else {
                cur = cur.right;
            }
        }
        return list;
    }
}

