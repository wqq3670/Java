import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-15
 * Time: 1:04
 **/
public class TestDemo {
    public static void main1(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("name",null);
        hashMap.put("name","jake");
        System.out.println(hashMap.size());
    }

    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.println("ping");
    }
    static void pong() {
        System.out.println("pong");
    }

}
