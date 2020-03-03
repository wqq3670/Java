/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-03
 * Time: 22:59
 **/
public class AntiOrder {
    public static int count(int[] A, int n) {
        int count = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i; j++) {
                if(A[j] > A[i]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        int ret = count(array,array.length);
        System.out.println(ret);
    }
}
