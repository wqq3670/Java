/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-01-15
 * Time: 16:07
 **/
public class TestDemo1 {
    public static String toLowerCase1(String str) {
        char[] ch1 = new char[str.length()];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if(c >= 65 && c <= 90) {
                c = (char)(c+32);
            }
            ch1[i] = c;
        }
        return new String(ch1);
    }
    public static void main(String[] args) {
        System.out.println(toLowerCase1("ASDsd"));
    }

}
