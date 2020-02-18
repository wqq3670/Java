import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-18
 * Time: 17:27
 **/
public class TestDomr1 {
    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {8,6,4,7,2,0,52,46,28,66,99,88};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


}
