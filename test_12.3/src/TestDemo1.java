import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-03
 * Time: 21:39
 **/
public class TestDemo1 {
    public static String func(String str) {
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++)
                if (chars[i] == chars[j]) {
                    //chars[i] = " ";
                    break;
                }
        }
        String tmp = new String(chars);
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String out = func(str);
        System.out.println(out);
    }
}
