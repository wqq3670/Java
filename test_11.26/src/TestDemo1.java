/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-26
 * Time: 21:11
 **/
public class TestDemo1 {
    public static boolean isNumber(String str) {

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "1a23456";
        System.out.println(isNumber(str));
    }
}
