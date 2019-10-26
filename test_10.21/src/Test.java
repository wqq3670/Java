import java.util.Arrays;


public class Test {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static int[] transform(int[] arr) {
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = 2 * arr[i];
        }
        return a;
    }

    public static void main(String[] args) {

//        int[][] array = {{1,2,3},{4,5,6}} ;
//        int[][] array1 = new int[][]{{1,3,5},{2,4,6}};
//        int[][] array2 = new int[2][3];

        int[][] array3 = new int[2][];
        int[][] array4 = {{1,2},{4,5,6}};

        for (int i = 0; i < array4.length; i++) {

            for (int j = 0; j < array4[i].length; j++) {

                System.out.print(array4[i][j]+" ");
            }
            System.out.println();
        }


//        System.out.println(Arrays.deepToString(array3));
//        System.out.println(Arrays.deepToString(array4));
        //   System.out.println(Arrays.deepToString(array2));
    //        int[] array = {1,3,5,7,9};
//        int[] ret = transform(array);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(ret));


//        int[] arr = null;
//        System.out.println(arr.length);
//        int[] array = {1, 2, 3, 4, 5, 6};
//        printArr(array);

//        System.out.println(Arrays.toString(array));
//        for (int x: array) {
//            System.out.println(x);
//        }
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.print(array[i] + " ");
//        }
//        System.out.println(array[10]);

//        System.out.println(array[2]);
//        array[2] = 66;
//        System.out.println(array[2]);
//        System.out.println(array[6]);
    }
}
