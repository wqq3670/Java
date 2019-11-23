/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-23
 * Time: 20:55
 **/
class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MySingleList {
    public ListNode head;

    public MySingleList() {
        this.head = null;
    }

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            //找尾巴
            ListNode cur = this.head;
            while(cur != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    public ListNode reverseList() {
        ListNode cur = this.head;
        ListNode newHead = null;
        ListNode prev = null;
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

    //以x为界限分割开来
    public ListNode partition(int x) {
        if(this.head == null || this.head.next == null) {
            return this.head;
        }
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data < x) {
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(bs == null) {
            return as;
        }
        be.next = as;
        if(as != null) {
            ae.next = null;
        }
        return bs;
    }

    public ListNode deleteDuplication() {
        if(this.head == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
                while(cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        //最后一个节点如果也是重复的
        //需要将tmp.next = null;
        tmp.next = null;
        return newHead.next;
    }
    //是否回文
    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }
            if(this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }
    //链表是否有环
    public boolean hasCycle() {
        if(this.head == null) {
            return false;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    //找入口点
    public ListNode detectCycle() {
        if(this.head == null) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null && fast.next == null) {
            return null;
        }
        slow = this.head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }



}
