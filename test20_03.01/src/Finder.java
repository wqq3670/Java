/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-02
 * Time: 18:07
 **/
public class Finder {
    private static int partion(int[] arr,int start,int end) {
        int tmp = arr[start];
        while(start < end) {
            while((start < end) && arr[end] >= tmp) {
              end--;  
            }
            if(start >= end) {
                arr[start] = tmp;
                break;
            }else {
                arr[start] = arr[end];
            }
            
            while((start < end) && arr[start] <= tmp) {
                start++;
            }
            if(start >= end) {
                arr[start] = tmp;
                break;
            }else {
                arr[end] = arr[start];
            }
        }
        return start;
    }

    private static void quick(int[] arr,int low,int high) {
        if(low < high) {
            int pivot = partion(arr,low,high);
            quick(arr,low,pivot-1);
            quick(arr,pivot+1,high);
        }
    }
    
    public static int findKth(int[] a, int n, int K) {
        quick(a,0,n-1);
        return a[n-K];
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        System.out.println(findKth(a,a.length,2));
    }
}
