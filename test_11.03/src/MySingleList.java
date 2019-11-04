//节点类
class ListNode {
    //属性
    public int data;
    public ListNode next;

    //带一个参数的构造函数（用来初始化）
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
    //标志一个头节点
    public ListNode head;

    //构造函数将 头结点初始化为空
    public MySingleList() {
        this.head = null;
    }
    //方法

    //1.头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        //判断是第几次插入
        if(this.head == null) {
            //第一次插入
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
        //判断是否为第一次插入
        if(this.head == null) {
            this.head = node;
        }else {
            // 1.找尾巴
            ListNode cur = this.head;
            while(true) {
                if(cur.next == null) {
                    //找到尾巴,进行插入
                    cur.next = node;
                    return;
                }else {
                    cur = cur.next;
                }
            }
        }
    }
    public void addLast1(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        //判断是否为第一次插入
        if(this.head == null) {
            this.head = node;
        }else {
            //1.找尾巴
            while(cur.next != null) {
                cur = cur.next;
            }
            //2.进行插入
            cur.next = node;
        }
    }
    //3.打印单链表数据
    public void display() {
        ListNode cur = this.head;
        //判断单链表是否为空
        if(head == null) {
            return;
        }
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //4.插入到index位置
    //任意位置插入,第一个数据节点为0号下标
    /**
     * 找到index-1位置
     * @param index
     * @return
     */
    private ListNode searchIndex(int index) {
        ListNode cur = this.head;
        for (int i = 0; i < index - 1 ; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public boolean addIndex(int index,int data){
        //判断index合法性
        if(index < 0 || index > getLength()) {
            System.out.println("index位置不合法");
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    public int getLength() {
        int count = 0;
        ListNode tmp = this.head;
        while(tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
    //5.查找是否包含关键字key是否在单链表当中
    public boolean contains(int key)  {
        ListNode cur = this.head;
        while(cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //6.删除第一次出现关键字为key的节点

    /**
     * 找删除的key的前驱
     * @param key
     * @return
     */
    private ListNode searchPrev(int key) {
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
        //1、删除的节点如果是头结点
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        } else {
            //2、找到删除的节点的前驱
            // 如果找不到  返回null
            ListNode prev = searchPrev(key);
            if(prev == null) {
                System.out.println("没有要删除的节点");
                return;
            }
            //3、进行删除
            ListNode del = prev.next;
            prev.next = del.next;
        }
    }
    //7.删除所有值为key的节点
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
        //最后处理头结点是否有要删除的key
        //（倘若头结点在一开始一直是key,则在前面就死循环了）
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //8.得到单链表的长度
    public int size() {
        return getLength();
    }

    //9.清空单链表
    //（1）暴力移除

    public void clear1() {

        this.head = null;
    }

    //(2)温柔移除法

    public void clear2() {
        while(this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }
}