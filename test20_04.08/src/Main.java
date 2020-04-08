import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-08
 * Time: 17:31
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            char[] ch = reverse(str);
            String str1 = new String(ch);
            String[] strArr = str1.split(" ");
            for(int i = 0; i < strArr.length; i++) {
                reverse(strArr[i]);
            }
            for (int i = 0; i < strArr.length; i++) {
                System.out.print(strArr[i]+" ");
            }
        }
    }
    private static char[] reverse(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length -1;
        while(left < right) {
            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
        return ch;
    }
}
