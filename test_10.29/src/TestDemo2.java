import java.util.Scanner;

public class TestDemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要操作的两个数：");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Swap swap1 = new Swap(x);
        Swap swap2 = new Swap(y);
        System.out.println("x = "+swap1.num);
        System.out.println("y = "+swap2.num);
        swap1.exchange(swap1,swap2);
        System.out.println("x = "+swap1.num);
        System.out.println("y = "+swap2.num);
    }
}

class Swap {
    //属性
    public int num;

//    public void setNum(int num) {
//        this.num = num;
//    }

    //构造函数
    public Swap(int num) {

        this.num = num;
    }
    public void exchange(Swap swap1,Swap swap2) {
        int tmp = swap1.num;
        swap1.num = swap2.num;
        swap2.num = tmp;
        System.out.println("交换中......");
    }


}