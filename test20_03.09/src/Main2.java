import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-09
 * Time: 18:54
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] cur = str.split(" ");
        int[] arr = new int[cur.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(cur[i]);
        }
        System.out.println(function(arr));
    }

    private static boolean function(int[] arr) {

    }
}
