import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-17
 * Time: 14:46
 **/
public class TestDome {
    /**
     *1.2一次向下调整
     * 时间复杂度 log2n
     * @param array
     * @param root
     * @param length
     */
    private static void adjustDown(int[] array,int root,int length) {
        int parent = root;
        int child = 2*parent+1;
        while(child < length) {
            if(child+1 < length && array[child] < array[child+1]) {
                child++;
            }
            //child指向最大的孩子节点
            if(array[parent] < array[child]) {
                int tmp =array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;//再以较大的孩子节点作为父节点
                child = 2*parent+1;//调整下面的子树
            }else {
                break;
            }
        }
    }

    /**
     * 1.1建立大根堆
     * 时间复杂度 n*log2n
     * @param array
     */
    private static void CreatHeap(int[] array) {
        //将每个父节点进行向下调整
        for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }
    /**
     * 1.堆排序
     * 时间复杂度 n*log2n
     * 空间复杂度 O（1）
     * 不稳定
     * @param array
     */
    private static void HeapSort(int[] array) {
        CreatHeap(array);//形成大根堆
        int end = array.length-1;
        while(end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    /**
     * 2.直接插入排序
     * 时间复杂度
     * 最好O（N）
     * 最坏O（N^2）
     * 空间复杂度 0（1）
     * 稳定
     * @param array
     */
    private static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp =array[i];
            int j = 0;
            for (j = i-1 ; j >= 0 ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;//前面已经有序
                }
            }
            array[j+1] = tmp;
        }
    }

    /**
     *希尔排序的分组
     * @param array
     */
    private static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }
    /**
     * 3.希尔排序
     * 时间复杂度  O(n^1.3~n^1.5)
     * 空间复杂度 O（1）
     * 不稳定
     * @param array
     * @param gap
     */
    private static void shell(int[] array, int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for (j = i-gap; j >= 0 ; j-=gap) {
                if(array[j] > tmp) {
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
     * 时间复杂度O(n^2)
     * 空间复杂度 O（1）
     * 不稳定
     * @param array
     */
    private static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10000];
        //获取一组无序的数据
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        //获取一组有序的数据
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        */

        Long long1 = System.currentTimeMillis();
        insertSort(arr);
        Long long2 = System.currentTimeMillis();
        System.out.println(long2-long1);
        System.out.println(Arrays.toString(arr));
        /*int[] array = {15,5,78,96,53,26,45,99,66,88};
        int[] array1 = {15,5,78,96,53,26,45,99,66,88,20,60,70,22,6};
        //HeapSort(array);
        //insertSort(array);
        //shellSort(array1);
        selectSort(array);
        System.out.println(Arrays.toString(array));
        */
    }




}
