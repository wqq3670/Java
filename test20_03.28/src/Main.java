import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-28
 * Time: 13:51
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            function(str1,str2);
        }
    }
    public static void function(String str1,String str2) {
        LinkedList<Character> list = new LinkedList<Character>();
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            list.add(ch);
        }
        int count = 0;
        for(int i = 0; i < str2.length(); i++){
            char ch = str2.charAt(i);
            for(int j = 0; j < list.size(); j++){
                if(ch == list.get(j)){
                    list.remove(j);
                    count++;
                    break;
                }
            }
        }
        if(count == str2.length())
            System.out.println("Yes "+ (str1.length()-count));
        else
            System.out.println("No "+ (str2.length()-count));
    }
    }
}