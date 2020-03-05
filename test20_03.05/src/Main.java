import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-05
 * Time: 21:33
 **/
public class Main {
    private static String maxNum(String str) {
        int count = 0;
        int max = 0;
        int last = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                count++;
                if (count > max) {
                    max = count;
                    last = i;
                }
            }else {
                count = 0;
            }
        }
        String ret = str.substring(last - max + 1, last + 1);
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(maxNum(str));
        }
    }
}
