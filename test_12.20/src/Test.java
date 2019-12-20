import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-20
 * Time: 23:36
 **/
class TreeNode{
    char value;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value){
        this.value = value;
    }
}
class BinaryTree {
    public TreeNode buildTree(){
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

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    TreeNode find(TreeNode root, int val){
        if(root == null){
            return null;
        }
        if(root.value == val){
            return root;
        }
        TreeNode ret = find(root.left,val);
        if(ret != null){
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null){
            return ret;
        }
        return null;
    }

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        System.out.println(binaryTree);
    }
}
