/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-23
 * Time: 17:29
 **/
public class Main {
    public static void main(String[] args) {
        int rich = 10*30;
        int strange = 1;
        int k = 1;
        for (int i = 0; i < 30; i++) {
            k = k*2;
            strange = strange+k;
        }
        System.out.println(rich+" "+strange);
    }
}
