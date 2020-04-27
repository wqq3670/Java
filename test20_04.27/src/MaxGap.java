import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:左右最值最大差
 * User: dell
 * Date: 2020-04-27
 * Time: 17:25
 **/
public class MaxGap {
    public static int findMaxGap(int[] A, int n) {
        // write code here
        int max = 0;
        int sub = 0;
        for (int k = 0; k <= n - 2; k++) {    //确定K范围
            int[] left = new int[k + 1];
            int[] right = new int[n - k - 1];//构建两个数组

            //把两个部分的值装进对应的数组
            for (int j = 0; j <= k; j++) {
                left[j] = A[j];
            }
            for (int m = k + 1; m < n; m++) {
                right[m-k-1] = A[m];
            }
            Arrays.sort(left);
            Arrays.sort(right);
            sub = Math.abs(left[left.length - 1] - right[right.length - 1]);
            if (sub > max) {
                max = sub;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(findMaxGap(A,n));
    }
}
