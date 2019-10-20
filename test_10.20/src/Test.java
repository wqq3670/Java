import java.util.Arrays;

public class Test {

    /**
     * 优化过的冒泡排序，
     * 如果一开始是有序的，那么只进去一趟(lenhgt-1次)不进行交换，
     * 出来的flag还是true
     * 进入if语句，break跳出，就不会有之后的一趟趟冒泡，提高了效率
     * 如果是一部分有序，在每趟进去还是先把flag = true,
     * 如果有一趟开始有序，则直接通过if跳出循环
     * @param arr
     */
    public static void buubleSort(int[] arr) {

        boolean flag = true;
        for (int i = 0; i < arr.length - 1 ; i++) {
            //趟数
            flag = true;
            for (int j = 0; j <arr.length - 1 -i ; j++) {
                //次数
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,66,6,8,99,88};
        System.out.println(Arrays.toString(array));
        buubleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
