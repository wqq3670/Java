
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-09
 * Time: 0:58
 **/
public class TestDemo {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        for (int i = 0; i < 10; i++) {
            int ret = myadd(i,i+1);
            System.out.print(ret+" ");
        }
    }

    private static int myadd(int i, int j) {
        return i + j;
    }
}
