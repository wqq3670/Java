/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-10
 * Time: 9:15
 **/
class ListNode {
    //属性
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingList {
    //属性
    public ListNode head;

    public MySingList() {
        this.head = null;
    }

    //反转单链表
    public ListNode reverseList() {
        ListNode prev = null;
        ListNode cur = this.head;
        ListNode newHead = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    //打印单链表中的数据
    public void displaynew(ListNode newHead) {
        if(newHead == null) {
            return;
        }
        ListNode cur = newHead;
        while(cur != null) {
            System.out.print(cur.data+" ");
        }
        System.out.println();
    }

    //编写代码，以给定值x为基准将链表分割成两部分，
    // 所有小于x的结点排在大于或等于x的结点之前





}
