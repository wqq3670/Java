import java.util.Arrays;

class MyArrayList {

    //属性
    private int[] elem;
    private int usedSize;
    private final int CAPACITY = 5;

    //构造函数对成员变量进行初始化
    public MyArrayList() {
        this.elem = new int[CAPACITY];
        this.usedSize = 0;//有效数据的个数
    }
    //方法

    // 1.打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 2.在 pos 位置新增元素
    //判断是否满了
    private boolean isFull() {
        /*if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
        //这种写法更加简洁
    }
    public void add(int pos, int data) {
        //判断位置合法性
        if( pos < 0 || pos > this.usedSize) {
            System.out.println("该位置不合法");
            return;
        }
        if(isFull()) {
            //二倍扩容
            this.elem = Arrays.copyOf(
                    this.elem,this.elem.length*2);
        }
        else {
            for (int i = this.usedSize - 1; i >= pos ; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
    }

    //3. 判定是否包含某个元素
    public boolean contains(int toFind) {

        for (int i = 0; i < usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 4.查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < usedSize ; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 5.获取 pos 位置的元素
    public int getPos(int pos) {
        for (int i = 0; i < usedSize; i++) {
            if(i == pos) {
                return this.elem[i];
            }
        }
        return -1;
    }

    // 6.给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
        }
        this.elem[pos] = value;
    }

    //7.删除第一次出现的关键字key
    public void remove(int toRemove) {
        //查找是否有这个数组
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("顺序表中没有这个元素！");
        }
        //删除元素
        for (int i = index; i < this.usedSize - 1 ; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    // 8.获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    // 9.清空顺序表
    public void clear() {
        this.usedSize = 0;
    }

}


