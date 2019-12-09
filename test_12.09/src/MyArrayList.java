/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-09
 * Time: 22:16
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public final int CAPCITY = 10;

    public MyArrayList() {
        this.elem = new int[CAPCITY];
        this.usedSize = 0;
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
       if(pos < 0 || pos > this.usedSize) {
           return;
       }
        for (int i = this.usedSize - 1; i >= pos ; i--) {
           this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(elem[i]);
        }
    }
}
