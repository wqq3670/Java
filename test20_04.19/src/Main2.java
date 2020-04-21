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
        while(sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if(isLeapYear(year)) {//是闰年的情况
                int ret1 = getOutLeapDay(month,day);
                System.out.println(ret1);
            }else {//不是闰年的情况
                int ret2 = getOutDay(month,day);
                System.out.println(ret2);
            }
        }
    }
    public static boolean isLeapYear(int year) {
        if((year%4==0 && year%100!=0)||(year%400==0)) {
            return true;
        }
        return false;
    }
    public static int getOutLeapDay(int month,int day) {
        int[] mon = {31,29,31,30,31,30,31,31,30,31,30,31};
        int outDay = 0;
        for(int i = 0; i < month-1; i++) {
            outDay += mon[i];
        }
        outDay += day;
        return outDay;
    }
    public static int getOutDay(int month,int day) {
        int[] mon = {31,28,31,30,31,30,31,31,30,31,30,31};
        int outDay = 0;
        for(int i = 0; i < month-1; i++) {
            outDay += mon[i];
        }
        outDay += day;
        return outDay;
    }
}
