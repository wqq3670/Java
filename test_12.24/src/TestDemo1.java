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
    public static void insertSort2(int[] array) {
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

    /**
     * 4.冒泡排序
     * 时间复杂度：
     * 最坏：O（n^2）
     * 最好：O（n） 有序的  只走了一趟（下面代码已经优化）
     * 空间复杂度：O（1）
     * 稳定性：稳定的排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        boolean flag = false;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if(!flag) {
                break;
            }
        }
    }

    /**
     * 5.快速排序
     * 时间复杂度：O（n*log2n）
     * 空间复杂度：O（log2n）因为有递归
     * 稳定性：不稳定
     * 快排比堆排快
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partion(int[] array,int start,int end) {
        int tmp = array[start];
        while(start < end) {
            while(start < end && array[end] >= tmp) {//注意"="号
                end--;
            }
            if(start >= end) {
                break;
            }else {
                array[start] = array[end];
            }

            while(start < end && array[start] <= tmp) {
                start++;
            }
            if(start >= end) {
                break;
            }else {
                array[end] = array[start];
            }
        }
        //出了循环，end start相遇（指向了同一个位置）
        array[start] = tmp;
        return start;
    }
    public static void quick(int[] array,int low,int high) {
        if(low >= high) {
            return;
        }
        int pivot = partion(array,low,high);
        //先左后右的递归
        quick(array,low,pivot-1);
        quick(array,pivot+1,high);
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }


    /**
     * 快排优化方式一 （在一定阈值里进行直接插入排序）
     * 因为
     */
    //对于partion函数优化写法
    public static int partion1(int[] array,int start,int end) {
        int tmp = array[start];
        while(start < end) {
            while(start < end && array[end] >= tmp) {//注意"="号
                end--;
            }
            array[start] = array[end];
            while(start < end && array[start] <= tmp) {
                start++;
            }
            array[end] = array[start];
        }
        //出了循环，end start相遇（指向了同一个位置）
        array[start] = tmp;
        return start;
    }
    public static void insertSort1(int[] array,int low,int high) {
        for (int i = low+1; i <= high; i++) {
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
    public static void quick1(int[] array,int low,int high) {
        if(low >= high) {
            return;
        }
        if(high-low+1 < 100) {
            insertSort1(array,low,high);
            return;
        }
        int pivot = partion(array,low,high);
        //先左后右的递归
        quick(array,low,pivot-1);
        quick(array,pivot+1,high);
    }
    public static void quickSort1(int[] array) {
        quick(array,0,array.length-1);
    }
    /**
     * 快排优化方式二 （三数取中法）
     *
     */


}
