/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-18
 * Time: 14:24
 **/
public class TestDemo1 {

    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                dianping();
            }
        };
        t.run();
        System.out.println("dazhong");
    }
    static void dianping() {
        System.out.println("dianping");
    }

}
