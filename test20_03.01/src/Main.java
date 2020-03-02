import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-01
 * Time: 19:26
 **/
public class Main {
    /**
     * 统计回文次数
     * @param a
     * @param b
     * @return
     */
    private static int HuiWenTimes(String a, String b) {
        int count = 0;
        for (int i = 0; i <= a.length(); i++) {
            StringBuilder sb = new StringBuilder(a);
            String tmp = sb.insert(i,b).toString();
            if(ispalindrome(tmp)) {
                count++;
            }
        }
        return count;
    }
    /**
     * 判断一个字符串是否为回文的
     * @param str
     * @return
     */
    private static boolean ispalindrome(String str) {
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i]  = str.charAt(i);
        }
        int left = 0;
        int right = ch.length-1;
        while(left <= right) {
            if(ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //System.out.println(palindrome(a));
        String b = sc.nextLine();
        int ret = HuiWenTimes(a,b);
        System.out.println(ret);
    }

}
