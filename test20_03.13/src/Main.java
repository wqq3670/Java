import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-13
 * Time: 16:36
 **/
public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(function(n));
    }

    private static int function(int n) {
//        if(n == 0) {
//            return 0;
//        }else {
//            return n/5+function(n/5);
//        }
        return n==0?0:n/5+function(n/5);

    }
}
