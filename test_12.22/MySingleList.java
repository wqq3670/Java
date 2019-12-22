/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-13
 * Time: 22:14
 **/

class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
    public ListNode head;

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
        }else {
            ListNode cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //3.任意位置插入一个data

    /**
     * 找到index -1的位置
     * @param index
     * @return
     */

    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }
    /**
     * 求链表长度
     * @return
     */
    public int getlength() {
        int count = 0;
        ListNode cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public boolean addIndex(int index,int data) {
        ListNode node = new ListNode(data);
        if (index < 0 || index > getlength()) {
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    //4.打印单链表中的数据
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while(cur != null) {
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //5.判断单链表中是否包含某个元素
    public boolean contains(int key) {
        if(this.head == null) {
            return false;
        }
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //6.删除第一次出现关键字为key的节点

    /**
     * 找到被删除节点的前一个节点
     * @param key
     * @return
     */
    public ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找前驱
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有要删除的节点");
            return;
        }
        ListNode del = prev.next;
        prev.next = del.next;
    }
    //7./删除所有值为key的节点
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
        //处理头结点
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //8.求单链表长度
    public int size() {
        return getlength();
    }
    //9.清空单链表
    public void clear() {
        if(this.head == null) {
            return;
        }
        //1.暴力清除法
        //this.head = null;
        //2.温柔清除法(可以直接用this.head操作)
        ListNode cur = this.head;
        while(cur.next != null) {
            cur.next = cur.next.next;
        }
        cur = null;
    }
    //10.反转单链表
    public ListNode reverseList() {
        if(this.head == null) {
            return null;
        }
        ListNode newHead = null;
        ListNode cur = this.head;
        ListNode prev = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            cur = prev;
            cur = curNext;
        }
        return newHead;
    }
    //11. 给定一个带有头结点 head 的非空单链表，
    // 返回链表的中间结点。
    // 如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode() {
        if(this.head == null) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //时间复杂度较高的方法
    public ListNode middleNode1() {
        if(this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        for (int i = 0; i < getlength()/2; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //12. 输入一个链表，输出该链表中倒数第k个结点
    public ListNode toFindToTail(int k) {
        if(k < 0 || this.head == null) {
            return null;
        }
        if(k == 0) {
            ListNode cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
        return cur;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        for (int i = 0; i < k - 1; i++) {
            if(fast.next == null) {
                System.out.println("k值不合法");
                return null;
            }
            fast = fast.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode toFindToTail1(int k) {
        if(this.head == null) {
            return null;
        }
        if(k < 0 || k > getlength()) {
            System.out.println("k值不合法");
            return null;
        }
        ListNode cur = this.head;
        for (int i = 0; i < getlength() - k; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //13.编写代码，以给定值x为基准将链表分割成两部分，
    // 所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(int x) {
        if(this.head == null) {
            return null;
        }
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data < x) {
                //是否为第一次插入
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = cur;
                }
            }else {
                //是否为第一次插入
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = cur;
                }
            }
            cur = cur.next;
        }
        //如果没有比x小的，则头为as
        if(bs == null) {
            return as;
        }
        be.next = as;//将前后两段连接起来

        //防止ae.next 不是null而导致出现死循环
        if(as != null) {
            ae.next = null;
        }
        return bs;
    }
    //14.在一个排序的链表中，存在重复的结点，
    // 请删除该链表中重复的结点，
    // 重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication() {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.next != null
                    && cur.data == cur.next.data) {

                while(cur.next != null
                        && cur.data == cur.next.data) {

                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                cur = tmp.next;
                tmp =tmp.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }

    //15. 链表的回文结构
    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        //找中间节点
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //一人一步走
        while(this.head != slow) {
            if(this.head.data != slow.data) {
                return false;
            }
            //排除1 2 2 1 这种个数为偶数的情况
            if(this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
    //16.给定一个链表，判断链表中是否有环。
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
    //17.给定一个链表，返回链表开始入环的第一个节点。
    // 如果链表无环，则返回 null


    //反转单链表
//    public ListNode reverse() {
//        if(this.head == null) {
//            return null;
//        }
//        ListNode newHead =null;
//        ListNode cur = this.head;
//        ListNode prev = null;
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




}
