import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-18
 * Time: 17:27
 **/
public class TestDomr1 {
    /**
     * 1.冒泡排序
     * 时间复杂度 最好 O（n）  平均 最坏O（n^2）
     * 空间复杂度 O（1）
     * 稳定
     * @param array
     */
    private static void bubbleSort1(int[] array) {
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

    /**
     * 2.堆排序
     * 时间复杂度  O（nlog 2n）
     * 空间复杂度  O（1）
     * 不稳定
     * @param array
     */
    private static void HeapSort(int[] array) {
        CreatHeap(array);//建立大根堆
        int end = array.length-1;
        while(end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    /**
     * 2.1建立大根堆
     * 时间复杂度  O（log 2n）
     * @param array
     */
    private static void CreatHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            adjustDown(array,i,array.length);
        }
    }
    /**
     * 2.2一次向下调整
     * 时间复杂度  O（nlog 2n）
     * @param array
     * @param root
     * @param length
     */
    private static void adjustDown(int[] array,int root,int length) {
        int parent = root;
        int child = 2*parent+1;
        while(child < length) {
            if(child+1 < length && array[child] < array[child+1]){
                child++;
            }
            if(array[parent] < array[child]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    /**
     * 直接插入排序
     * 时间复杂度 最好 O（1）==》有序 (越有序越快)
     *            最坏O（n^2）
     * 空间复杂度 O（1）
     * 稳定
     * @param array
     */
    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            int tmp = array[i];
            for (j = i - 1; j >= 0 ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    /**
     * 希尔排序
     * 时间复杂度 最好 O（n^1.3~n^1.5）
     * 空间复杂度 O（1）
     * 稳定
     * @param array
     */
    private static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }
    private static void shell(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int j = 0;
            int tmp = array[i];
            for (j = i-gap; j >= 0; j-=gap) {
                if(array[j] > tmp ) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    /**
     * 选择排序
     * 时间复杂度 O（n^2）
     * 空间复杂度 O（1）
     * 不稳定
     * @param array
     */
    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < ; j++) {
                
            }
        }
    }



    public static void main(String[] args) {
        int[] array = {8,6,4,7,2,0,52,46,28,66,99,88,55,33,22};
        //bubbleSort1(array);
        //HeapSort(array);
        //insertSort(array);
        //shellSort(array);
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    

}
