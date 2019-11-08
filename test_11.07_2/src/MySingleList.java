/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-07
 * Time: 19:46
 **/

/**
 * 类节点
 */
class ListNode {
    //属性
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
    //属性
    public ListNode head;

    public MySingleList() {
        this.head  = null;
    }
    //方法
    //1.头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        //判断单链表是否为空 若空，则为第一次插入
        if(this.head == null) {
            this.head = node;
        }else {
            //第二次插入
            node.next = this.head;
            this.head = node;
        }
    }

    //2.尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        //判断单链表是否为空 若空，则为第一次插入
        if(this.head == null) {
            this.head = node;
        }
        ListNode cur = this.head;
        while(cur.next != null) {
            //找尾巴
            cur = cur.next;
        }
        cur.next = node;
    }
    //3.任意位置插入,第一个数据节点为0号下标
    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }
    public boolean addIndex(int index,int data) {
        ListNode node = new ListNode(data);
        if (index < 0 || index > getlength()) {
            return false;
        }else {
            if (index == 0) {
                addFirst(data);
                return true;
            }
            ListNode prev = searchIndex(index);
            node.next = prev.next;
            prev.next = node;
            return true;
        }
    }
    public int getlength() {
        ListNode cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //4.打印单链表中的数据
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

    //5.查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if (this.head == null) {
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

    //7.删除所有值为key的节点
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }
        ListNode prev = this.head;
        ListNode cur = this.head.next;
    }



}