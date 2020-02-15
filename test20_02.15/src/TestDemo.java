import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-15
 * Time: 20:00
 **/
public class TestDemo {
    /**
     * 构建大根堆
     * （一个for循环将父节点挨个进行向下调整）
     * @param array
     */
    public static void CreatHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0; i--) {
            adjustDown(array,i,array.length);
        }
    }
    /**
     * 向下调整（一次）
     * @param array
     * @param root
     * @param len
     */
    private static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while(child < len) {
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            //child保存了两个孩子节点中最大的孩子节点
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }

    }
    /**
     * 堆排序
     * 时间复杂度O（n*log2为底的n）  最好最坏平均都是这个
     * 空间复杂度O(1)
     * 不稳定的排序
     * 建堆的时间复杂度是 O（n*log2为底的n）
     * 一次调整的时间复杂度 O（log2为底的n）
     * (用最后一个数和堆顶数据交换，在进行向下调整)
     * @param array
     */
    private static void HeapSort(int[] array) {
        CreatHeap(array);
        int end = array.length-1;
        while(end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end);//end = 9
            end--;//end = 8
        }
    }

    /**
     * 直接插入排序
     * 时间复杂度：最坏：0（n的平方） 最好：O(n)--》有序的情况下
     * 越有序的情况下越快
     * 空间复杂度：O（1）
     * 稳定的排序
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int tmp = array[i];
            while(j >= 0) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                    j--;
                }else {
                    break;//前面的序列已经有序
                }
            }
            array[j+1] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {54,15,24,89,13,88,66,99,9,52};
        HeapSort(array);//堆排序
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
