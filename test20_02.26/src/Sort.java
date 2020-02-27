import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-27
 * Time: 21:33
 **/
public class Sort {
    private static void HeapSort(int[] array) {
        creatHeap(array);
        int end = array.length-1;
        while(end > 0) {
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    private static void creatHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    private static void adjustDown(int[] array,int root,int length) {
        int parent = root;
        int child = 2*root+1;
        while(child < length) {
            if(child+1 < length && array[child] < array[child+1]) {
                child++;
            }//child指向较大的孩子节点
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

    public static void main(String[] args) {
        int[] array = {1,8,92,88,66,55,41,94,12,4};
        System.out.println(Arrays.toString(array));
        HeapSort(array);
        System.out.println(Arrays.toString(array));

    }
}
