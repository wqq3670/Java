import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-06
 * Time: 18:22
 **/
public class Main1 {

    public static String func1(String str) {
        String[] strs = str.split(" ");
        String ret = "";
        for (int i = 0; i < strs.length; i++) {
            ret += strs[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ret = func1(str);
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
       // System.out.println(deleteStr(str1,str2));
    }

//    private static String deleteStr(String str1, String str2) {
//        StringBuilder sb = new StringBuilder(str1);
//        for (int i = 0; i < str2.length(); i++) {
//            char ch = str2.charAt(i);
//
//        }
//
//    }
}
