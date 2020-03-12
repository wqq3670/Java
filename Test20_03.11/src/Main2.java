import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:删数
 * User: dell
 * Date: 2020-03-11
 * Time: 22:15
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {//处理循环输入
            int n = sc.nextInt();
            if(n > 1000) {//处理>1000的情况
                n = 1000;
            }
            System.out.println(function(n));
        }
    }
    private static int function(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);//放入数据
        }
        int i = 0;
        int ret = 0;
        while(list.size() > 0) {
            //得到要删除数现在所在的下标（随着删数size减少下标会变）
            i = (i+2)%list.size();
            if(list.size() == 1) {
                //当size==1时，就是要得到的最后一个要删除的数
                //它的值就是他原来所在的下标
                ret = list.get(0);//此刻他一定在0号位置
            }
            list.remove(i);//删除数
        }
        return ret;
    }

}
