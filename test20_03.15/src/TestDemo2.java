/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-16
 * Time: 15:04
 **/
public class TestDemo2 {
    public static void add(Byte b) {
        b = b++;
    }
    public static void test() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a+" ");
        add(b);
        System.out.println(b+" ");
    }

    public static void main(String[] args) {
        test();
    }
    链接：https://www.nowcoder.com/questionTerminal/845ec89145b04b2b855d020d9c3ea2ef?pos=40&mutiTagIds=609&orderByHotValue=1&questionTypes=000100
    来源：牛客网

    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
    }
}
