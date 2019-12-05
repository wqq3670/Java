import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-28
 * Time: 13:34
 **/
public class Test1 {
    public static String func(String str1,String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        char[] chars = new char[str1.length()+str2.length()];
        for (int i = 0; i < str1.length(); i++) {
            chars[i] = ch1[i];
        }
        for (int i = 0; i < str2.length(); i++) {
            chars[str1.length()+i] = ch2[i];
        }
        String tmp = new String(chars);
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个字符串：");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("result:");
        String result = func(str1,str2);
        System.out.println(result);
    }
}
