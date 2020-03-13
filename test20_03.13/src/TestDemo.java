/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-13
 * Time: 16:23
 **/
public class TestDemo {
    private static void testMethod() {
        System.out.println("testMethod");
    }

    public static void main(String[] args) {
        String x = "fmn";
        x.toUpperCase();
        String y = x.replace('f','F');
        y = y+"wxy";
        System.out.println(y);
    }
    public static void main2(String[] args) {
        ((TestDemo)null).testMethod();
    }
    public static void main1(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i==j);
        System.out.println(j.equals(i));
    }
}
