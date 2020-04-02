import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-02
 * Time: 12:27
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //获取候选人个数
            int candidateNum = sc.nextInt();
            //获取候选人名字
            List<String> list = new LinkedList<String>();
            for (int i = 0; i < candidateNum; i++) {
                String name = sc.next();
                list.add(name);
            }
            //获取投票人个数
            int voterNum = sc.nextInt();
            //新建一个数组来存储候选人和他的票数
            int[] arr = new int[candidateNum];
            //统计无效票
            int Invalid = 0;
            //获取投票情况
            for (int i = 0; i < voterNum; i++) {
                String str = sc.next();
                if(list.contains(str)) {
                    int index = list.indexOf(str);
                    arr[index]++;
                }else {
                    Invalid++;
                }
            }
            for (int i = 0; i < candidateNum; i++) {
                System.out.println(list.get(i)+" : "+arr[i]);
            }
            System.out.println("Invalid : "+Invalid);

        }
    }
}
