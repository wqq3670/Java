/**
 * Created with IntelliJ IDEA.
 * Description:力扣每日一题
 * 合并两个有序链表
 * User: dell
 * Date: 2020-05-01
 * Time: 17:23
 **/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Main {
    public ListNode mergeTwoLists
            (ListNode headA, ListNode headB) {
        //新建一个头结点和一个tmp
        //tmp标志当前新合成链表的尾节点
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(headA != null && headB != null) {
            //原来两个有序链表  节点值大小比较 放在tmp节点的后面
            if(headA.val < headB.val) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        //处理两个链表不一样长的情况
        // （也就是一个遍历完了，另一个还有节点）
        if(headA != null) {
            tmp.next = headA;
        }else if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
}
