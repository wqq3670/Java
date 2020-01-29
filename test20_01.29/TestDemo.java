import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-19
 * Time: 23:12
 **/
public class TestDemo {
    public static void main(String[] args) {
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

            //相同的树
            public boolean isSameTree(TreeNode p, TreeNode q) {
                if((p == null && q != null)||(p != null && q == null)){
                    return false;
                }
                if(p == null & q == null){
                    return true;
                }
                if(p.value != q.value){
                    return false;
                }
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }

            //t是否为S的子树
            public boolean isSubtree(TreeNode s, TreeNode t) {
                if(s == null || t == null){
                    return false;
                }
                if(isSameTree(s,t)){
                    return true;
                }
                if(isSubtree(s.left,t)){
                    return true;
                }
                if(isSubtree(s.right,t)){
                    return true;
                }
                return false;
            }
        }
    }
}
