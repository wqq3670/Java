import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:找x
 * User: dell
 * Date: 2020-04-03
 * Time: 10:18
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int k = sc.nextInt();
            if(list.contains(k)) {
                System.out.println(list.indexOf(k));
            }else {
                System.out.println(-1);
            }
        }
    }
}
