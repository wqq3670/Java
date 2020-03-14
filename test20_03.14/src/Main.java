import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-14
 * Time: 16:54
 **/
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N=in.nextInt();
            int a=0,b=1;
            while(b<=N){
                int b_temp=b+a;
                a=b;
                b=b_temp;
            }
            System.out.print((b-N)>(N-a)?N-a:b-N);
        }
    }
import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        // 从右下角 向左下角 走 是一样的
        // 若只剩最后 单条 不管 另一值是多少，都是只能一步走 （这个是从1开始的）
        if(x == 1 || y == 1) {
            return 1;
        }
        // 否则 就去 这个点的左一个节点到根部的 走法数 和 这个点的正下面一个节点到根部的 走法数
        return countWays(x-1,y) + countWays(x,y-1);
    }
}
