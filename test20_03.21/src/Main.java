import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-21
 * Time: 12:27
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n1 = sc.nextInt();
            if(n1 == 0) {
                return;
            }
            int[] arr = new int[n1];
            for (int i = 0; i < n1; i++) {
                arr[i] = sc.nextInt();
            }
            int n2 = sc.nextInt();
            int count = 0;
            for (int i = 0; i < n1; i++) {
                if(arr[i] == n2) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
