import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-10
 * Time: 15:38
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int row = sc.nextInt();
        System.out.println(function(line,row));
    }

    /**
     * 不要二
     * @param line
     * @param row
     * @return
     */
    private static int function(int line, int row) {
        int count = 0;
        int[][] arr = new int[line][row];
        for (int i = 0; i < line; i++) {
            if(i%4==0 || i%4==1) {
                for (int j = 0; j < row; j++) {
                    if(j%4==0 || j%4==1) {
                        arr[i][j] = 1;
                    }
                }
            }
        }
        for (int j = 0; j < row; j++) {
            if(j%2==0 || j%2==1) {
                for (int i = 0; i < line; i++) {
                    if(j%2==0 || j%2==1){
                        arr[i][j] = 1;
                    }
                }
            }

        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                count = count+arr[i][j];
            }
        }
        return count;
    }
}
