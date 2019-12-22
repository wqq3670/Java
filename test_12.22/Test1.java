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
    public static ListNode getIntersectionNode
                    (ListNode headA,ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pL = headA;//永远指向最长的链表
        ListNode pS = headB;//永远指向最短的链表

        //求各自链表长度 得出两个链表长度的差值
        int lenA = 0;
        int lenB = 0;
        while(pL != null) {
            lenA++;
            pL = pL.next;
        }
        while(pS != null) {
            lenB++;
            pS = pS.next;
        }
        int len = lenA - lenB;
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenB - lenA;
        }else {
            pL = headA;
            pS = headB;
        }

        //让长的链表先走差值步
        while(len > 0) {
            pL = pL.next;
            len--;
        }
        //一起一人一bu走
        while(pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        return pL;
    }


    public static void main(String[] args) {

    }
}
