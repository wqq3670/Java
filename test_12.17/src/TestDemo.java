import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-17
 * Time: 17:39
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        TreeNode root = myBinaryTree.bulidTree();

        List<Character> ret = myBinaryTree.preOrderTraversal(root);
        System.out.println(ret);

        ret = myBinaryTree.inOrderTraversal(root);
        System.out.println(ret);

        ret = myBinaryTree.postOrderTraversal(root);
        System.out.println(ret);

        myBinaryTree.getSize1(root);
        System.out.println(MyBinaryTree.size);
        System.out.println(myBinaryTree.getSize2(root));

        myBinaryTree.getLeafSize1(root);
        System.out.println(MyBinaryTree.leafSize);
        System.out.println(myBinaryTree.getLeafSize2(root));

        System.out.println(myBinaryTree.getKLevelSize(root,3));

        System.out.println(myBinaryTree.find(root,'H').value);


    }
}
