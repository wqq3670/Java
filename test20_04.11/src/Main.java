import java.util.Scanner;
import static java.lang.Math.PI;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-11
 * Time: 17:40
 **/

public class Main{
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        double x0=Integer.valueOf(in.next());
        double y0=Integer.valueOf(in.next());
        double z0=Integer.valueOf(in.next());
        double x1=Integer.valueOf(in.next());
        double y1=Integer.valueOf(in.next());
        double z1=Integer.valueOf(in.next());
        double R=0.0;
        double V=0.0;
        //直接利用公式进行计算
        R=Math.sqrt((x1-x0)*(x1-x0)+(y1-y0)*(y1-y0)+(z1-z0)*(z1-z0));
        V=(4*PI*R*R*R)/3.0;
        System.out.printf("%.3f",R);
        System.out.printf(" ");
        System.out.printf("%.3f\n",V);

    }
}
