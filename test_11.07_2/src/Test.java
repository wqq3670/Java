/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-07
 * Time: 19:19
 **/
public class Test {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(1);
        mySingleList.addFirst(2);
        mySingleList.addFirst(3);
        mySingleList.addFirst(4);
        mySingleList.addFirst(5);
        mySingleList.display();
        mySingleList.addLast(6);
        mySingleList.addLast(7);
        mySingleList.display();
        mySingleList.addIndex(0,0);
        mySingleList.addIndex(8,8);
        mySingleList.display();
        mySingleList.remove(3);
        mySingleList.display();
    }
}
