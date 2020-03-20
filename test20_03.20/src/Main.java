import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-20
 * Time: 17:54
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(funtion(x));
    }

    private static int funtion(int x) {
        for (int i = 0; i < 100000; i++) {
            if(4*i*x+3==0 || 8*i*x+7 == 0) {
                return i;
            }
            if(((4*i*x+3)%100000007==0) || ((8*i*x+7)%100000007 == 0)) {
                return i;
            }
        }
        return -1;
    }
}
