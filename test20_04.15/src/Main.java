import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-15
 * Time: 17:56
 **/

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[][] toDo = new int[n][2];//要操作的数组 放了n行2列
            for(int i = 0; i < n; i++) {
                toDo[n][0] = sc.nextInt();
                toDo[n][1] = sc.nextInt();
            }
            cabBeShape(n,toDo);
        }
    }
    private static void cabBeShape(int n,int[][] toDo) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(toDo[i][0] == 1) {
                list.add(toDo[i][1]);
            }else {
                list.remove(toDo[i][1]);
            }
            if(isAShape(list)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
    private static boolean isAShape(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int temp = list.remove(i);
            int sum = 0;
            for (int j = 0; j < list.size() - 1; j++) {
                sum += list.get(j);
            }
            if (sum <= temp) { //判断是否任意len-1条边之和大于剩余一条边
                list.add(i, temp);
                return false;
            }
            list.add(i, temp);
        }
        return true;
    }
}
