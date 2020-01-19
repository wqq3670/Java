/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-01-19
 * Time: 21:14
 **/
class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}
public class MySingleList {
    private ListNode head;

    public MySingleList() {
        this.head = null;
    }

    //1.头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //2.尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }
        //找尾巴
        ListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //3.打印链表数据
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //3.任意位置插入
    public boolean addIndex(int index,int data) {
        //判断index位置的合法性
        if(index < 0 || index > size()) {
            System.out.println("插入位置不合法！");
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        if(index == size()) {
            addLast(data);
            return true;
        }
        //找到index位置
        ListNode prev = prevIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    private ListNode prevIndex(int index) {
        ListNode prev = this.head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        return prev;
    }
    //4.单链表的长度
    public int size() {
        ListNode cur = this.head;
        int len = 0;
        while(cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }


}
