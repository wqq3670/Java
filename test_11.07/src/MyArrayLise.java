import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:顺序表的实现
 * User: dell
 * Date: 2019-11-07
 * Time: 13:27
 **/
class MyArrayLise {
    //属性
    private int[] elem;
    private int usedSize;
    private final int CAPACITY = 5;

    //构造方法进行初始化
    public MyArrayLise() {
        this.elem = new int[CAPACITY];
        this.usedSize = 0;
    }

    //方法

    //1.打印顺序表
    public void display() {
        if(this.usedSize == 0) {
            return;
        }
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");

        }
        System.out.println();
    }

    //2.在pos位置新增元素

    /**
     * 判断顺序表、是否放满了
     * @return
     */
    private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    public void add(int pos,int data) {
        if(isFull()) {
            //对数组进行二倍扩容
            this.elem = Arrays.copyOf(this.elem,
                    this.elem.length*2);
        }
        //判断pos的合法性
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }else {
            for (int i = this.usedSize - 1; i >= pos ; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
    }

    //3.判定是否包含某个元素
    public boolean contains(int toFind) {
        if(this.usedSize == 0) {
            return false;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //4.查找某个元素对应的位置
    public int search(int toFind) {
        if(this.usedSize == 0) {
            return -1;
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //5.获取pos位置的元素
    public int getPos(int pos) {
        if(this.usedSize == 0) {
            return -1;
        }
        //判断pos位置是否合法
        if(pos < 0 || pos > this.usedSize) {
            return -1;
        }
         return this.elem[pos];
    }

    //6.给pos位置的元素设为value
    public void setPos(int pos,int value) {
        if(this.usedSize == 0) {
            return;
        }
        //判断pos位置的合法性
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("pos位置不合法");
            return;
        }
        this.elem[pos] = value;
    }

    //7.删除第一次出现的关键字key
    public void remove(int toRemove) {
        if(this.usedSize == 0) {
            return;
        }
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有要删除的关键字");
            return;
        }else {
            //找到key，进行删除
            for (int i = index; i < this.usedSize - 1; i++) {
                this.elem[i] = this.elem[i+1];
            }
            this.usedSize--;
        }
    }
    //8.获取顺序表的长度
    public int size() {
        return this.usedSize;
    }

    //9.清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
}
