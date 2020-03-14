/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-14
 * Time: 15:51
 **/
public class TestDemo {
//    public int add(int a,int b) {
//        try{
//            return a+b;
//        }
//        catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally {
//            System.out.println("finally");
//        }
//        return 0;
//    }
//    public static void main1(String[] args) {
//        TestDemo testDemo = new TestDemo();
//        System.out.println("和是:"+testDemo.add(9,34));
//    }

    public static void main2(String[] args) {
        try{
            int i = 100/0;
            System.out.println(i);
        }catch (Exception e) {
            System.out.println(1);
            throw new RuntimeException();
        }finally {
            System.out.println(2);
        }
        System.out.println(3);
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println(arr[0]);
    }
}
