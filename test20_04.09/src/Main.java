import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-09
 * Time: 16:04
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String all = sc.nextLine();
        String[] tmp = all.split(" ");
        String P = tmp[0];
        String A = tmp[1];
        giveChange(P,A);
    }
    private static void giveChange(String P,String A) {
        String[] ptmp = P.split("\\.");
        int[] Parr = new int[3];
        for(int i = 0; i < Parr.length; i++) {
            Parr[i] = Integer.valueOf(ptmp[i]);
        }
        String[] atmp = A.split("\\.");
        int[] Aarr = new int[3];

        for(int i = 0; i < Aarr.length; i++) {
            Aarr[i] = Integer.valueOf(atmp[i]);
        }
        int[] ret = new int[3];
        //处理最后一位
        if(Aarr[2] - Parr[2] >= 0) {
            ret[2] = Aarr[2] - Parr[2];
        }else {
            Aarr[1]--;
            ret[2] = Aarr[2] - Parr[2]+19;
        }
        //处理倒数第二位
        if(Aarr[1] - Parr[1] >= 0) {
            ret[1] = Aarr[1] - Parr[1];
        }else {
            Aarr[0]--;
            ret[1] = Aarr[1] - Parr[1]+17;
        }
        //处理第一位
        ret[0] = Aarr[0] - Parr[0];
        for(int i = 0; i < ret.length; i++) {
            if(i < ret.length-1) {
                System.out.print(ret[i]+".");
            }else {
                System.out.print(ret[i]);
            }
        }
    }
}
