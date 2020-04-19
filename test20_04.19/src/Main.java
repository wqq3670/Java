import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-19
 * Time: 22:55
 **/
public class Main {
    public static void main(String[] args) {
        //输入数据
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = arr[0];
        int max = arr[0];
        for(int i = n-2; i >= 0; i--) {
            if(sum < 0) {
                break;
            }else if(arr[i] < 0) {
                break;
            }else if(arr[i] == arr[i+1]) {
                continue;
            }else {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
