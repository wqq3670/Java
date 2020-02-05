import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-04
 * Time: 17:42
 **/
public class TestDemo {
    public static int[] sortArrayByParity(int[] A) {
        int[] num = new int[A.length];
        int n = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2 == 0) {
                num[n++] = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2 == 1) {
                num[n++] = A[i];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(A)));

    }
}
