import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-26
 * Time: 17:30
 **/
public class Gift {
    public static int getValue(int[] gifts, int n) {
        int count = 0;
        Arrays.sort(gifts);
        for (int i = 0; i < n; i++) {
            if(i < n-1) {
                if(gifts[i] == gifts[i+1]) {
                    count++;
                }
            }
            if(count+1 >= n/2) {
                return gifts[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gifts = new int[n];
        for (int i = 0; i < n; i++) {
            gifts[i] = sc.nextInt();
        }
        System.out.println(getValue(gifts,n));
    }


}
