/**
 * Created with IntelliJ IDEA.
 * Description:接口多继承代码测试
 * 类和接口是实现的关系 implements
 * 接口和接口是继承的关系 extends
 * User: dell
 * Date: 2019-11-21
 * Time: 21:43
 **/
interface A {
    void fun1();
}
interface B {
    void fun2();
}

class C implements A,B {        //C 这个类实现了A B 接口
    @Override
    public void fun1() {

    }

    @Override
    public void fun2() {

    }
}
interface D extends A,B {   //D 接口继承了A B 接口
    void fun3();
}

class SE implements D {//SE 实现了D接口  就要把D继承A B 的接口也都实现了
    @Override
    public void fun2() {

    }

    @Override
    public void fun1() {

    }

    @Override
    public void fun3() {

    }
}
public class TestDome1 {
    public static void main(String[] args) {

    }
}
