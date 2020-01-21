import java.util.Arrays;

class MyArrList {
    //属性
    private int[] elem;
    private int usedSize;
    private final int CAPACITY = 5;

    //构造函数(初始化成员变量)
    public MyArrList(){

        this.elem = new int[CAPACITY];
        this.usedSize = 0;
    }

    //方法

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素

    private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    public void add(int pos, int data) {
        //判断是否数组满了
        if(isFull()) {
            //将数组扩容至原数组的二倍
            this.elem = Arrays.copyOf(
                    this.elem,this.elem.length*2);
        }
        //判断pos位置是否合法
        if(pos < 0 || pos > this.usedSize ) {
            System.out.println("pos位置不合法");
            return;
        }
        else {
            for (int i = this.usedSize - 1; i >= pos; i--) {
                this.elem[i+1] =this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        System.out.println("没有这个元素");
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        //判断pos位置的合法性
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return -1;
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        //判断pos位置的合法性
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        //找到关键字,并且获取他的下标
        int index = search(toRemove);
        if(index == -1) {
            //-1代表找不到这个元素
            return;
        }
        //删除
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] =this.elem[i+1];
        }
        this.usedSize--;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}
