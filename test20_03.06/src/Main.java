import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:买苹果
 * User: dell
 * Date: 2020-03-06
 * Time: 17:07
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ret = buyApple(num);
        System.out.println(ret);
    }

    private static int buyApple(int num) {
        //判断输入的要买的苹果数是否在1-100之间
        if(num < 1 || num > 100) {
            return -1;
        }
        int small = num/6;//全买小袋苹果的袋数
        int big = num/8;//全买大袋苹果的袋数
        int min = -1;//定义组合最小的袋数为-1  如果不能以整数购买即返回min(-1)
        for (int i = 0; i <= small; i++) {
            for (int j = 0; j <= big; j++) {
                if(6*i+8*j == num) {
                    if(min == -1) {//处理第一次找到袋数的情况
                        min = i+j;
                    }else if(i+j < min) {//判断之后是否有更好的组合方式
                        min = i+j;
                    }
                }
            }
        }
        return min;
    }
}
