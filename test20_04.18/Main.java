import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-04
 * Time: 15:45
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            numberOfKeepShape(n);
        }
    }

    private static void numberOfKeepShape(int n) {
        int square = n*n;
        if((square%10==n) || (square%100==n)) {
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }
    }
}
