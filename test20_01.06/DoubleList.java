/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-17
 * Time: 9:35
 **/
class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;
    public ListNode(int data) {
        this.data = data;
    }
}

class DoubleList {
    public ListNode head;
    public ListNode last;//尾巴

    //1.头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            //第一次插入
            this.head = node;
            this.last = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //2.尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            //第一次插入
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //3.2任意位置插入,第一个数据节点为0号下标
    // （将找找到被插入的下标的元素位置写成一个方法）
    private ListNode searchIndex(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }
        ListNode cur = this.head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    public void addIndex(int index, int data) {
        //头插
        if (index == 0) {
            addFirst(data);
            return;
        }
        //尾插
        if (index == size()) {
            addLast(data);
            return;
        }
        //其他中间情况
        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);
        if (cur == null) {
            System.out.println("index位置不合法");
            return;
        } else {
            cur.prev.next = node;
            node.next = cur;
            node.prev = cur.prev;
            cur.prev = node;
            return;
        }
    }

    //3.1任意位置插入,第一个数据节点为0号下标
    public void addIndex1(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("index位置不合法");
            return;
        }
        //头插
        if (index == 0) {
            addFirst(data);
            return;
        }
        //尾插
        if (index == size()) {
            addLast(data);
            return;
        }
        //其他中间情况
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        //找到被插入的下标的元素位置
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.prev.next = node;
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
    }

    //4.打印双向链表中的数据
    public void display() {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
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
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //6.删除第一次出现关键字为key的节点
    public int remove(int key) {
        if (this.head == null) {
            return -1;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                //cur 为head
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    //中间位置和last位置
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;//没有要删除的数字
    }

    //7.删除所有值为key的节点
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                //cur 为head
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    //中间位置和last位置
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = cur.prev;
                    }
                }
            }
                cur = cur.next;
        }
    }

    //8.得到单链表的长度
    public int size() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //9.清空双向链表
    public void clear() {
        //头尾都要置为null
        while (this.head != null) {
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last = null;
    }
}






