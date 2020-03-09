/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-09
 * Time: 17:22
 **/
public class TsetDemo {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(test(num));
    }

    public static int test(int b) {
        try
        {
            b += 10;
            return b;
        }
        catch(RuntimeException e)
        {
        }
        catch(Exception e)
        {
        }
        finally {
            b+=10;
            return b;
        }
    }
}
