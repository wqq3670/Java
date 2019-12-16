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
        System.out.println("前序遍历");
        binaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("中序遍历");
        binaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println("后序遍历");
        binaryTree.postOrderTraversal(root);
        System.out.println();

        System.out.println("求节点个数");
        binaryTree.getSize1(root);
        System.out.println(BinaryTree.size1);
        System.out.println(binaryTree.getSize2(root));

        System.out.println("求叶子节点个数");
        binaryTree.getLeafSize1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getLeafSize2(root));

        System.out.println();
        int ret = binaryTree.getKLevelSize(root,4);
        System.out.println(ret);

        System.out.println(binaryTree.find(root,'H').value);


    }
}
