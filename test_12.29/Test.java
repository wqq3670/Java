import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static int fun1(int x,int y) {
        int c = 0;
        while(x % y != 0) {
            c = x % y;
            x = y;
            y = c;
        }
        return c;
    }

    public static int fun2(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(i%10 == 9) {
                count++;
            }
            if(i/10 == 9) {
                count++;
            }
        }
        return count;
    }

    public static void waterFlower(int n) {
        for (int i = 0; i < n ; i++) {
            //1.求位数
            int tmp = i;
            int count = 0;
            while(tmp != 0) {
                count++;
                tmp /= 10;
            }
            tmp = i;
            //2.求和
            int sum = 0;
            while(tmp != 0) {
                sum += Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }

    //不改变原来数组的大小，写一个transform将一个新数组变为
    // 原来数组的二倍，并且返回这个数组
    public static int[] transform(int[] a) {
        int[] arr = new int[5];
        for (int i = 0; i <a.length ; i++) {
            arr[i] = a[i]*2;
        }
        return arr;
    }

    //模拟实现Arrays.toString 方法

    public static String toString(int[]  a1) {

        String str1 = "[";
        for (int i = 0; i <a1.length ; i++) {
            str1 = str1+a1[i];
            if(i < a1.length - 1) {
                str1 += ",";
            }
        }
       str1 +="]" ;
        return str1;
    }

    public static int maxArr(int[] a1) {
        int max = a1[0];
        for (int i = 1; i < a1.length ; i++) {
            if(max < a1[i]) {
                int tmp = max;
                max = a1[i];
                a1[i] = tmp;
            }
        }
        return max;
    }

    public static int minArr(int[] a2) {
        int min = a2[0];
        for (int i = 1; i < a2.length ; i++) {
            if(min > a2[i]) {
                int tmp = min;
                min = a2[i];
                a2[i] = tmp;
            }
        }
        return min;
    }

    public static double avgArr(int[] a3) {
        double sum = a3[0];
        for (int i = 1; i <a3.length ; i++) {

            sum += a3[i];
        }
        double avg = sum/a3.length;
        return avg;
    }
    public static int[] reverseArr(int[] a4) {
        int left = 0;
        int right = a4.length -1;
        while(left < right) {
            int tmp = a4[left];
            a4[left] = a4[right];
            a4[right] = tmp;
            left++;
            right--;
        }
       return a4;
    }

    public static int binarySearch(
            int[] arr,int k,int left,int right) {
        if(left > right) {
            return -1;
        }
        int mid = (left + right)>>>1;

        if(arr[mid] == k) {
            return mid;
        }else if(arr[mid] > k) {
           return binarySearch(arr, k, left, mid - 1);
        }else {
           return binarySearch(arr,k,mid+1,right);
        }
    }


    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6};
        int ret = binarySearch(array,6,0,array.length);
        System.out.println("找到了，下标是："+ ret);
//        System.out.println("max = " + maxArr(array));
//        System.out.println("min = " + minArr(array));
//        System.out.println("avg = " + avgArr(array));
//        int[] ret = reverseArr(array);
//        System.out.println(Arrays.toString(ret));


//        String str = toString(array);
//        System.out.println(str);

//        int [] arr1 = new int[5];
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arr1));
//        arr1 = transform(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(arr1));

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        waterFlower(a)；
//        System.out.println(ret);
//        int ret = fun2(a);
//        int b = sc.nextInt();
//        int ret = fun1(a,b);
//        System.out.println(ret);

    }
}
