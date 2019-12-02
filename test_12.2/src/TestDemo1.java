/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-02
 * Time: 21:25
 **/
public class TestDemo1 {
    public static boolean isAllNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "1a23456";
        String str2 = "12345";
        String str3 = "asdfsj";
        System.out.println(isAllNum(str1));
        System.out.println(isAllNum(str2));
        System.out.println(isAllNum(str3));
    }
}
