import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-23
 * Time: 23:49
 **/
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            StringBuilder sb = new StringBuilder(in.nextLine());
            for(int i=0; i<sb.length(); i++){
                if(sb.charAt(i) == '_'){
                sb.replace(i,i+2,(sb.charAt(i+1)+"").toUpperCase());
                }
            }
            System.out.println(sb.toString());
        }
    }
}
