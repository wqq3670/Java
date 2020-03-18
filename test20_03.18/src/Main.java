import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-18
 * Time: 14:50
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        printSquare(n,c);
    }

    private static void printSquare(int n, String c) {
        int line = n/2;
        if(n%2 != 0) {
            line = n/2+1;
        }
        for (int i = 0; i < n; i++) {
            //处理首行
            System.out.print(c);
        }
        System.out.print('\n');
        //处理中间行
        for (int i = 0; i < line-1-1; i++) {
            System.out.print(c);
            for (int j = 0; j < n-1-1; j++) {
                System.out.print(" ");
            }
            System.out.print(c);
            System.out.print('\n');
        }
        //处理最后一行
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }


    }
}
