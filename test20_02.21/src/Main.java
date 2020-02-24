import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
        int a = 0;
        int b = 1;
        int c = 1;
        while(c < num) {
            c = a+b;
            a = b;
            b = c;
        }
        if(Math.abs(b-num) < Math.abs(c-num)) {
            System.out.println(Math.abs(b-num));
        }else {
            System.out.println(Math.abs(c-num));
        }
    }
}
