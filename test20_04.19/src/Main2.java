import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-20
 * Time: 23:42
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(isLeapYear(year)) {//是闰年的情况
            

        }else {//不是闰年的情况

        }
    }
    public static boolean isLeapYear(int year) {
        if((year%4==0 && year%100!=0)||(year%400==0)) {
            return true;
        }
        return false;
    }
}
