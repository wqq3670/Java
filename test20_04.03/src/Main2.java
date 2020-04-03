import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-03
 * Time: 10:33
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String ip = sc.nextLine();
            convertToInteger(ip);
            long num = sc.nextLong();
            convertToIp(num);
        }
    }

    /**
     * ip转数字
     * @param ip
     */
    private static void convertToInteger(String ip) {
        String[] ipArr = ip.split("\\.");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ipArr.length; i++) {
            String str = Long.toBinaryString(Long.parseLong(ipArr[i]));
            while(str.length()!=8 && i!=0) {
                str = "0"+str;
            }
            sb.append(str);
        }
        System.out.println(Long.parseLong(sb.toString(),2));
    }

    /**
     * 数字转ip
     * @param num
     */
    private static void convertToIp(long num) {
        String ip = Long.toBinaryString(num);//全是二进制
        StringBuffer sb = new StringBuffer();
        //补齐的倍数
        while(ip.length()%8 != 0) {
            ip = "0"+ip;
        }

        for (int i = 0; i < ip.length(); i+=8) {
            String str = ip.substring(i,i+8);
            sb.append(Long.parseLong(str,2)+".");
        }
        System.out.println(sb.toString().substring(0,sb.toString().length()-1));
    }


}
