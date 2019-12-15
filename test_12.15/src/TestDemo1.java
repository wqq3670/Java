/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-15
 * Time: 15:46
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();

        int ret = binaryTree.getKLevelSize(root,4);
        System.out.println(ret);

        System.out.println(binaryTree.find(root,'H').value);


    }
}
