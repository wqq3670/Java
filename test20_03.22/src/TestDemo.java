/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-22
 * Time: 17:17
 **/
class X {
    Y y = new Y();
    public X() {
        System.out.println("X");
    }
}
class Y {
    public Y() {
        System.out.println("Y");
    }
}
public class TestDemo extends X{
    Y y = new Y();
    public TestDemo() {
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new TestDemo();
    }

}
