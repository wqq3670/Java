import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-23
 * Time: 10:30
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        while(sc.hasNext()) {
            String str1 = sc.nextLine();
            String[] str = str1.split(" ");
            for (int i = 0; i < str.length; i++) {
                    set.add(str[i]);

            }
        }

        int count = set.size();
        System.out.println(count);

    }
}
