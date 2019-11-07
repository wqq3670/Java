/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-07
 * Time: 19:46
 **/

/**
 * 类节点
 */
class ListNode {
    //属性
    public int data;
    public ListNode next;

    //构造函数进行初始化
    public ListNode(int data) {
        this.next = null;
    }
}
class MySingleList {
    //属性
    public ListNode head;

    //构造方法进行初始化
    public MySingleList() {
        this.head  = null;
    }

    //方法

    //1.头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        //判断单链表是否为空 若空，则为第一次插入
        if(this.head == null) {
            this.head = node;
        }else {
            //第二次插入
            node.next = this.head;
            this.head = node;
        }
    }

    //2.尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        //判断单链表是否为空 若空，则为第一次插入
        if(this.head == null) {
            this.head = node;
        }
        ListNode cur = this.head;
        while(cur.next != null) {
            //找尾巴
            cur = cur.next;
        }
        cur.next = node;
    }
    //3.




}