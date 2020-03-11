import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-11
 * Time: 17:33
 **/
public class Main {
    /**
     * n个数里最小的k个
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()) {
            list.add(sc.nextInt());
        }
        int k = list.get(list.size()-1);
        list.remove(list.size()-1);
        Collections.sort(list);
        for (int i = 0; i < k; i++) {
            System.out.print(list.get(i));
        }

    }


}
