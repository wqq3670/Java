/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-23
 * Time: 16:23
 **/
public class TestDemo {
    public static void main(String[] args) {
        Integer i01 = 59;
        int i02 = 59;
        Integer i03 = Integer.valueOf(59);
        Integer i04 = new Integer(59);
        System.out.println(i01==103);
        System.out.println(i01==102);
        System.out.println(i03==104);
        System.out.println(i02==104);
    }
}
