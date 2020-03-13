import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-13
 * Time: 16:40
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            int left = 0;
            int right = ch.length-1;
            while(left < right) {
                char tmp = ch[left];
                ch[left] = ch[right];
                ch[right] = tmp;
                left++;
                right--;
            }
            System.out.println(ch);
        }

    }
}
