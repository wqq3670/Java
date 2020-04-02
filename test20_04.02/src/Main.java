import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-02
 * Time: 11:28
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            System.out.print(sumOfFigures(n)+" "+sumOfFigures(n*n));
        }
    }

    private static int sumOfFigures(int n) {
        if(n/10 == 0) {
            return  n;
        }
        return (n%10)+sumOfFigures(n/10);
    }
}
