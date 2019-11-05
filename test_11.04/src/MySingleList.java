
//节点类
class ListNode {
    //属性
    public int data;
    public ListNode next;

    //构造方法进行初始化
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

}

//单链表
class MySingleList {

    public ListNode head;

    public MySingleList() {
        this.head = null;
    }

    //方法

    //1.头插法
    public void addFirst(int data) {
        //判断第几次插入
        ListNode node = new ListNode(data);
        if(this.head == null) {
            //第一次插入
            this.head = node;
        }else {
            //第二次
            node.next = this.head;
            this.head = node;
        }
    }
    //2.尾插法
    public void addLast(int data) {
        //判断第几次插入
        ListNode node = new ListNode(data);
        if(this.head == null) {
            //第一次插入
            this.head = node;
        }
        //找尾巴
        ListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        //进行插入
    }
    //3.打印单链表中的数据
    public void display() {
        //判断单链表是否为空
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
    //4.将data插入到Index位置
    public ListNode searchIndex(int Index) {
        ListNode prev = this.head;
        for (int i = 0; i < Index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }
    public boolean addIndex(int Index,int data) {
        //判断位置是否合法
        if(Index < 0 || Index > getlength()) {
            System.out.println("Index位置不合法");
            return false;
        }
        //
        if(Index == 0){
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(Index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    public int getlength() {
        int count = 0;
        ListNode cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //5.
//    public boolean contains(int key) {
//        ListNode cur
//    }

    //6.
    public ListNode seachPrev(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    public void remove(int key) {
        if(this.head.data == key) {
            this.head = this.head.next;
        }else {
            //找前驱
            if (seachPrev(key) == null) {
                System.out.println("没有要删除的节点");
                return;
            }
            ListNode prev = seachPrev(key);
            ListNode del = prev.next;
            prev.next = del.next;
        }
    }

    //7.删除所有为key的节点
    public void removeAllKey(int key) {
        //判断链表是否为空
        if(this.head == null) {
            return;
        }
        ListNode prev = this.head;
        ListNode cur = prev.next;
        while(cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    //反转单链表
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
    //打印新单链表数据
    public void displaynew(ListNode newHead) {
        //判断单链表是否为空
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
    //
    public ListNode middleNode1() {
        if(this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        for (int i = 0; i < (getlength()/2); i++) {
            cur = cur.next;
        }
        return cur;
    }
    public ListNode middleNode() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode findKthToTail(int k) {
        if(k < 0 || this.head == null) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        for (int i = 0; i < k - 1; i++) {
            if(fast.next != null) {
                fast = fast.next;
            }else {
                System.out.println("K值不合法");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
