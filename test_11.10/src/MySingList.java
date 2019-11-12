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

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    //反转单链表
    public ListNode reverseList() {
        if(this.head == null) {
            return null;
        }
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
            cur = cur.next;
        }
        System.out.println();
    }

    //删除所有key节点
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //倒数第k个节点
    public ListNode findKthToTail(int k) {

        if(k <= 0 || this.head == null) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k - 1 > 0) {
            if(fast.next == null) {
                return null;
            }
            fast = fast.next;
            k--;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //反转
//    public ListNode reverselist() {
//        ListNode prev = null;
//        ListNode cur = this.head;
//        ListNode newHead = null;
//        while(cur != null) {
//            ListNode curNext = cur.next;
//            if(curNext == null) {
//                newHead = cur;
//            }
//            cur.next = prev;
//            prev = cur;
//            cur = curNext;
//        }
//        return newHead;
//    }

    //打印数据
    //打印单链表中的数据
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

    //编写代码，以给定值x为基准将链表分割成两部分，
    // 所有小于x的结点排在大于或等于x的结点之前





}
