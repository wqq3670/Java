import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-25
 * Time: 18:42
 **/
public class Substr {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] ret = new boolean[n];
        for (int i = 0; i < n; i++) {
            ret[i] = s.contains(p[i]);
        }
        return ret;
    }
    public static void main(String[] args) {


    }
}
