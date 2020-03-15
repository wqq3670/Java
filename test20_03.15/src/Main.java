import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-15
 * Time: 1:17
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] ch = new int[10];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ch[c-'0']++;
        }
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != 0) {
                System.out.println(i+":"+ch[i]);
            }
        }
    }
}
