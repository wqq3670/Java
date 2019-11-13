/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-13
 * Time: 22:22
 **/
public class Test1 {

    //将两个有序链表合并为一个新的有序链表并返回。
    //新链表是通过拼接给定的两个链表的所有节点组成的
    public ListNode mergeTwoLists
                (ListNode headA, ListNode headB) {
        if(headA == null && headB == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA == null) {
            tmp.next = headB;
        }
        if(headB == null) {
            tmp.next = headA;
        }
        return newHead.next;
    }

    //输入两个链表，找出它们的第一个公共结点


    public static void main(String[] args) {

    }
}
