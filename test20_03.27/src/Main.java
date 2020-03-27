import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-27
 * Time: 16:45
 **/
public class Main {
    public static int getTotalCount(int monthCount) {
        if(monthCount == 1 || monthCount == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        while(monthCount > 2) {
            c = a+b;
            a = b;
            b = c;
            monthCount--;
        }
        return c;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int monthCount = sc.nextInt();
            System.out.println(getTotalCount(monthCount));
        }

    }
}
