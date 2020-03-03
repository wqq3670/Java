/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-03
 * Time: 14:20
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }

    private static boolean isAdmin(String str) {
        return str.toLowerCase() == "admin";
    }
}
