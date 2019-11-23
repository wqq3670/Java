/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-23
 * Time: 20:59
 **/
public class Test {
    //是否相交
    public ListNode getIntersectionNode(ListNode headA,ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pL = headA;
        ListNode pS = headB;


    }


    //两个有序链表合成一个有序链表
    public static ListNode mergeTwoLists(ListNode headA,ListNode headB) {
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
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }




    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();


    }
}
