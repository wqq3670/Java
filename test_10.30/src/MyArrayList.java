class MyArrayList {
    //属性
    public int[] elem;
    public int usedSize;
    public final int CAPACITY = 5;


    //构造函数进行初始化
    public MyArrayList() {
        this.elem = new int[CAPACITY];
        this.usedSize = 0;
    }
    //方法
    // 打印顺序表
    public void display() {

        for (int i = 0; i < this.usedSize; i++) {

            System.out.print(this.elem[i]+" ");
        }
    }
    // 在 pos 位置新增元素
    private boolean isFull() {


    }
    public void add(int pos, int data) {
        //判断位置合法性
        if(pos < 0 || pos > usedSize) {
            System.out.println("pos位置不合法！");
            return;
        }

        //判断是否满了
        if(isFull()) {

        }

    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) { return true; }
    // 查找某个元素对应的位置
    public int search(int toFind) { return -1; }
    // 获取 pos 位置的元素
    public int getPos(int pos) { return -1; }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) { }
    //删除第一次出现的关键字key
    public void remove(int toRemove) { }
    // 获取顺序表长度
    public int size() { return 0; }
    // 清空顺序表
    public void clear() { }
}
