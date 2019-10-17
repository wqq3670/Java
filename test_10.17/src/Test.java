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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        waterFlower(a);

        //System.out.println(ret);
        //int ret = fun2(a);
        //int b = sc.nextInt();
        //int ret = fun1(a,b);
        //System.out.println(ret);

    }
}
