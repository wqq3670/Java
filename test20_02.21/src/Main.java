import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-23
 * Time: 10:50
 **/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 2 ) {
            System.out.println(0);
        }else {
            for (int i = 0; i < ; i++) {
                
            }
        }

    }

    private static int fib(int num) {
        if(num == 0) {
            System.out.println(0);
        }else if(num == 1 || num == 2) {
            System.out.println(1);
        }
        return fib(num-1)+fib(num-2);

    }
}
