import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-20
 * Time: 17:05
 **/
public class TestDemo1 {
    public static int addAB(int A, int B) {
        if(B!=0){
            int a=A^B;
            int b=(A&B)<<1;
            return addAB(a,b);
        }else{
            return A;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(addAB(a,b));
    }
}
