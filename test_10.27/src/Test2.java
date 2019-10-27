//编写一个类Calculator,有两个属性num1,num2,这两个数据的值，
// 不能在定义的同时初始化，最后实现加减乘除四种运算.
class Calculator{
    //属性
    int num1;
    int num2;

    //构造函数(并对成员变量进行初始化)
    public Calculator() {
        this.num1 = 10;
        this.num2 = 20;
    }

    //方法

    //加
    public int add (int x, int y) {
        return x + y;
    }

    //减
    public int sub(int x, int y) {
        return x - y;
    }

    //乘
    public int mul(int x, int y) {
        return x * y;
    }

    //除
    public int div(int x, int y) {
        return x / y;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5,3));

    }
}
