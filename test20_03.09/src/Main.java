import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-09
 * Time: 18:08
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int A = (n1+n3)/2;
        int B = (n2+n4)/2;
        int C = n4-B;
        if(((n1+n3)%2==0)&&((n2+n4)%2==0)&&(A+B==n3)) {
            System.out.println("A= "+A+" B= "+B+" C= "+C);
        }else {
            System.out.println("NO");
        }

    }
}
