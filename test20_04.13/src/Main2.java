import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-13
 * Time: 17:56
 **/

public class Main2{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str = in.nextLine();
            System.out.println(Integer.parseInt(str.substring(2),16));//str.substring(2)表示去除0x
        }
    }
}
