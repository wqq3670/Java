/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-19
 * Time: 9:15
 **/
public class TestBinaryTree {
    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public void insert(int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return;
        }
        Node cur = root;
        Node parent = null;
        //1.找叶子节点  正确插入节点
        while (cur != null) {
            if(cur.data > key) {
                parent = cur;
                cur = cur.left;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                System.out.println("不能插入");
                return;
            }
        }
        //2.开始插入
        if(parent.data > key) {
            parent.left = node;
        }else {
            parent.right = node;
        }
    }

    //查找   key
    public Node search(int key) {
        Node cur = root;
        while (cur != null) {
            if (cur.data > key) {
                cur = cur.left;
            } else if (cur.data < key) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }

    public void inorder(Node root) {
        if(root == null) {
            return;
        }else {
            inorder(root);
            inorder(root.left);
            inorder(root.right);
        }
    }

    //删除关键字为key的节点
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.data == key) {
                //找到了要删除的节点
                removeNode(parent,cur);
                return;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }
    public void removeNode(Node parent,Node cur){

        if(cur.left == null) {//左为空

            if(cur == root) {
                root = cur.right;
            }else if(cur == parent.left){
                parent.left = cur.right;
            }else {
                //cur == parent.right
                parent.right = cur.right;
            }

        }else if(cur.right == null) {//右为空
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                //cur == parent.right
                parent.right = cur.left;
            }

        }else {

        }

    }

}
