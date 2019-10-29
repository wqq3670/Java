import java.util.Scanner;

//编写一个类Calculator,有两个属性num1,num2,这两个数据的值，
// 不能在定义的同时初始化，最后实现加减乘除四种运算.
class Calculator{
    //属性
    private double num1;
    private double num2;

    //方法
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    //加
    public double add () {
        System.out.print("相加:");
        return num1 + num2;
    }
    //减
    public double sub() {
        System.out.print("相减:");
        return num1 - num2;
    }
    //乘
    public double mul() {
        System.out.print("相乘:");
        return num1 * num2;
    }
    //除
    public double div() {
        System.out.print("相除:");
        return num1 / num2;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要操作的两个数：");
        double x = sc.nextInt();
        double y = sc.nextInt();
        calculator.setNum1(x);
        calculator.setNum2(y);
        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.div());
        System.out.println(calculator.mul());
    }
}
