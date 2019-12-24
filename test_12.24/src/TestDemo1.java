import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-24
 * Time: 19:52
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        int[] array = new int[10000];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i;//有序
//        }
    }
    public static void main1(String[] args) {
        int[] array = {9,5,2,7,3,6,4,5,8,0};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 1.直接插入排序
     * 时间复杂度
     * 最好：O（n）  ---> 有序的情况下（当数据越有序越快）
     * 最坏：O（n^2）--->无序或者逆序
     * 空间复杂度：O（1）
     * 稳定性：稳定的排序
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int tmp = array[i];
            while(j >= 0) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
                j--;
            }
            array[j+1] = tmp;
        }
    }
    public static void insertSort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            int tmp = array[i];
            for (j = i - 1; j >= 0; j--) {
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
     * 3.选择排序
     * 时间复杂度：O（n^2）好、坏、平均都一样
     * 空间复杂度：O（1）
     * 稳定性：不稳定
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }


}
