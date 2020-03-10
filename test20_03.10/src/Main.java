import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-10
 * Time: 15:13
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n > m) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        //m代表两个数中最大的那一个
        System.out.println(function(m,n));
    }

    /**
     * 求最小公倍数
     * @param m
     * @param n
     * @return
     */
    private static int function(int m, int n) {
        if(m%n == 0) {
            return m;
        }
        for (int i = 2; i < n ; i++) {
            if((i*m)%n == 0) {
                return i*m;
            }
        }
        return m*n;
    }
}
