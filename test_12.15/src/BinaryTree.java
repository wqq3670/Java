import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-15
 * Time: 15:46
 **/
class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;

    public TreeNode(char value) {
        this.value = value;
    }
}
public class BinaryTree {

    /**
     * 建树
     * @return
     */
    public TreeNode buildTree() {
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

    /**
     * 前序遍历
     * @param root
     */
//    void preOrderTraversal(TreeNode root) {
//        if(root == null) {
//            return;
//        }
//        System.out.print(root.value+" ");
//        preOrderTraversal(root.left);
//        preOrderTraversal(root.right);
//    }

    public List<Character> preOrderTraversal(TreeNode root) {
        List<Character> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        System.out.print(root.value+" ");
        list.add(root.value);
        List<Character> list1 = preOrderTraversal(root.left);
        list.addAll(list1);
        List<Character> list2 = preOrderTraversal(root.right);
        list.addAll(list2);
        return list;
    }

    /**
     * 中序遍历
     * @param root
     */
//    void inOrderTraversal(TreeNode root) {
//        if(root == null) {
//            return;
//        }
//        inOrderTraversal(root.left);
//
//        System.out.print(root.value+" ");
//        inOrderTraversal(root.right);
//    }

    public List<Character> inOrderTraversal(TreeNode root) {
        List<Character> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        List<Character> list1 = inOrderTraversal(root.left);
        list.addAll(list1);
        System.out.print(root.value+" ");
        list.add(root.value);
        List<Character> list2 = inOrderTraversal(root.right);
        list.addAll(list2);
        return list;
    }

    /**
     * 后序遍历
     * @param root
     */
//    void postOrderTraversal(TreeNode root) {
//        if(root == null) {
//            return;
//        }
//        postOrderTraversal(root.left);
//        postOrderTraversal(root.right);
//        System.out.print(root.value+" ");
//    }

    public List<Character> postOrderTraversal(TreeNode root) {
        List<Character> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        List<Character> list1 = postOrderTraversal(root.left);
        list.addAll(list1);
        List<Character> list2 = postOrderTraversal(root.right);
        list.addAll(list2);
        System.out.print(root.value+" ");
        list.add(root.value);
        return list;
    }

    /**
     * 求节点个数
     * 左子节点的节点个数+右子节点的节点个数+1
     */
    //1.遍历思路 =》 求节点个数
    static int size1 = 0;
    void getSize1(TreeNode root) {
        if(root == null) {
            return;
        }
        size1++;
        getSize1(root.left);
        getSize1(root.right);
    }
    //2.子问题思路 =》求叶子节点个数
    int getSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right)+1;
    }

    /**
     *求叶子节点个数
     * 左叶子节点的节点个数+右叶子节点的节点个数
     */
    //1.遍历思路 =》 求叶子节点个数
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
    //2.子问题思路 =》求叶子节点个数
    int getLeafSize2(TreeNode root) {
        if(root == null) {
            return 0;
        }else if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    /**
     * 子问题思路 =》求第k层节点个数
     * A的 第K层的个数 相当于 = （A.left的第K-1层的个数）+（A.right的第K-1层的个数）
     * @param root
     * @param k
     * @return
     */
    int getKLevelSize(TreeNode root, int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k -1)+ getKLevelSize(root.right,k -1);
    }

    /**
     * 查找val所在节点，没有找到返回null(按照  根 =》左子树 =》右子树 的顺序)
     * 一旦找到，立即返回，不需要继续在其他位置查找
     * @param root
     * @param val
     * @return
     */
    TreeNode find(TreeNode root,int val) {
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

    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null && q != null || p != null && q == null) {//结构不相同
            return false;
        }
        if(p.value != q.value) {//值不同
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }








}
