import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-17
 * Time: 17:39
 **/
class TreeNode {
    public char value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char value) {
        this.value = value;
    }
}
public class MyBinaryTree {

    public TreeNode bulidTree() {
        TreeNode root = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return root;
    }

    // 前序遍历 (根-》左-》右)
    public List<Character> preOrderTraversal(TreeNode root) {
        List<Character> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        //System.out.print(root.value+" ");
        list.add(root.value);
        list.addAll(preOrderTraversal(root.left));
        list.addAll(preOrderTraversal(root.right));
        return list;
    }

    // 中序遍历 (左-》根-》右)
    public List<Character> inOrderTraversal(TreeNode root) {
        List<Character> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.addAll(inOrderTraversal(root.left));
        list.add(root.value);
        list.addAll(inOrderTraversal(root.right));
        return list;
    }

    //非递归实现 中序遍历
    List<Character> inOrderTraversalNor(TreeNode root) {
        List<Character> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.value);
            System.out.println(cur.value+" ");
            cur = cur.right;
        }
        return list;
    }

    // 后序遍历 (左-》右-》根)
    public List<Character> postOrderTraversal(TreeNode root) {
        List<Character> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.addAll(postOrderTraversal(root.left));
        list.addAll(postOrderTraversal(root.right));
        list.add(root.value);
        return list;
    }

    /**
     * 非递归实现 中序遍历
     *1.当前节点是否已经被打印
     *2.prev ->
     *3.cur = null
     */


    // 遍历思路-求结点个数
    static int size = 0;
    void getSize1(TreeNode root) {
        if(root == null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
    }
    // 子问题思路-求结点个数
    int getSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getSize2(root.left)+getSize2(root.right)+1;
    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(TreeNode root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left)+getLeafSize2(root.right);
    }

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(TreeNode root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    TreeNode find(TreeNode root, int val) {
        if(root == null) {
            return null;
        }
        if(root.value == val) {
            return root;
        }
        TreeNode ret = find(root.left,val);
        if(ret == null) {
            ret = find(root.right,val);
        }
        return ret;
    }

    ////非递归实现 层序遍历
    void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur.value+" ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }

    }
    // 判断一棵树是不是完全二叉树 boolean isCompleteTree



}
