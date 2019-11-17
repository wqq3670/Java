/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-17
 * Time: 9:27
 **/
public class TestDemo1 {

    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.addLast(5);
        doubleList.addIndex(0,99);
        doubleList.addIndex(6,99);
        doubleList.addIndex(3,66);
        doubleList.display();
        //System.out.println(doubleList.contains(99));
//        doubleList.remove(1);
//        doubleList.remove(99);
        doubleList.removeAllKey(99);
        doubleList.display();
        doubleList.clear();
        System.out.println("hhsagah");
    }



}
