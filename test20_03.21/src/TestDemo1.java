/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-21
 * Time: 12:17
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        int i = 5;
        int s = (i++)+(++i)+(i--)+(--i);
        System.out.println(s);
    }
}
