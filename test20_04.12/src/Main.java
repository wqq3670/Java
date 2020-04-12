import java.lang.Math;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-12
 * Time: 17:59
 **/

public class Main{
    public static void main(String[] args){
        long sumRich=0;
        long sumStranger=0;
        for(int i=1;i<=30;i++){
            sumRich+=10;
            sumStranger=sumStranger+(long)Math.pow(2,i-1);
        }
        System.out.print(sumRich+" "+sumStranger);
    }
}