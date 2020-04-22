import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-22
 * Time: 23:52
 **/
public class Main {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m;

        while(sc.hasNext()) {
            n = sc.nextInt();
            m = sc.nextInt();
            dfs(1, m, n);
            for(ArrayList<Integer> l : res) {
                int i = 0;
                for(; i < l.size() - 1; i++) {
                    System.out.print(l.get(i) + " ");
                }
                System.out.println(l.get(i));
            }
        }
    }

    public static void dfs(int index, int count, int n) {
        if(count == 0) {
            res.add(new ArrayList<>(list));
        }
        else {
            for(int i = index; i <= count && i <= n; i++) {
                list.add(i);
                dfs(i + 1, count - i, n);
                list.remove(list.size() - 1);
            }
        }
    }
}
