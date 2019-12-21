/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-21
 * Time: 15:12
 **/
class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.value = value;
    }
}
public class MyBinaryTree {
    public void tree2strChild(TreeNode t,StringBuilder str) {
        if(t == null) {
            return;
        }
        str.append(t.value);
        if(t.left == null) {
            if(t.right == null) {
                return;
            }else {
                str.append("()");
            }
        }else {
            str.append("(");
            tree2strChild(t.left,str);
            str.append(")");
        }
        if(t.right == null) {
            return;
        }else {
            str.append("(");
            tree2strChild(t.right,str);
            str.append(")");
        }
    }
    public String tree2str(TreeNode t) {
        StringBuilder stringBuilder = new StringBuilder();
        tree2strChild(t,stringBuilder);
        return stringBuilder.toString();
    }
}
