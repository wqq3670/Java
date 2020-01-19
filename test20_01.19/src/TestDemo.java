/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-01-19
 * Time: 21:14
 **/
public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(5);
        mySingleList.addFirst(4);
        mySingleList.addFirst(3);
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.display();
        System.out.println("=====================");
        mySingleList.addLast(6);
        mySingleList.addLast(7);
        mySingleList.addLast(8);
        mySingleList.addLast(9);
        mySingleList.addLast(10);
        mySingleList.display();


    }
}
