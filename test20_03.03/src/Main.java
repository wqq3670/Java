import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:汽水瓶
 * User: dell
 * Date: 2020-03-03
 * Time: 23:10
 **/
public class Main {
    private static int drink(int n) {
        int count = 0;
        int remin = 0;
        if(n > 0 && n <= 100) {
            if(n == 1) {
                return 0;
            }else if(n == 2) {
                return 1;
            }
        }
        while(n > 2) {
            count = count + n/3;//当n>2时  累加起来可以换的瓶数
            remin = n%3;//换完之后  剩余的空瓶数
            n = n/3+remin;//新的n 剩余空瓶数+ 刚刚换的饮料瓶数
            if(n == 2) {//如果n == 2时，在原来基础上加一个就好了
                //相当于向老板借一瓶
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(sc.hasNext()) {
            num = sc.nextInt();
            System.out.println(drink(num));
        }
    }
}
