import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-01-16
 * Time: 16:10
 **/
public class TestDemo1 {
    /**
     * 判断一个数是否为回文数
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        String str = x+"";
        char[] ch = new char[str.length()];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            ch[i] = c;
        }
        int left = 0;
        int right = ch.length - 1;
        while(left < right) {
            if(ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
       return true;
    }

    /**
     * 求一个字符串中最后一个单词的长度
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        if(s.length() == 0) {
            return 0;
        }
        String[] result = s.split(" ");
        if(result.length == 0) {
            return 0;
        }
        String str = result[result.length -1];
        return str.length();
    }
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int ret = lengthOfLastWord(sc.nextLine());
        System.out.println(ret);
        /*Boolean ret = isPalindrome(sc.nextInt());
        System.out.println(ret);
        */
    }
}
