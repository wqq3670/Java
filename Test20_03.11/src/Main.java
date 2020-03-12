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
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(sc.hasNext()) {
            list.add(sc.nextInt());
        }
        int k = list.get(list.size()-1);
        list.remove(list.size()-1);
        Collections.sort(list);
        for (int i = 0; i < k-1; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.print(list.get(k-1));
    }

    /**
     * 分装函数写法
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        smallK(str);
    }
    private static void smallK(String str) {
        String[] ss = str.split(" ");
        int[] arr = new int[ss.length-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(ss[i]);
        }
        int k = Integer.parseInt(ss[ss.length-1]);
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
