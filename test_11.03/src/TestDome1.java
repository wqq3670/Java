public class TestDome1 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
//        mySingleList.addLast(1);
//        mySingleList.addLast(2);
//        mySingleList.addLast(3);
//        mySingleList.addLast(4);
//        mySingleList.addLast(5);
//        mySingleList.display();
        mySingleList.addFirst(1);
        mySingleList.addFirst(2);
        mySingleList.addFirst(2);
        mySingleList.addFirst(4);
        mySingleList.addFirst(5);
        mySingleList.display();
        mySingleList.remove(3);
        mySingleList.display();
        mySingleList.remove(5);
        mySingleList.display();
        mySingleList.addLast(2);
        mySingleList.display();
        mySingleList.removeAllKey(2);
        mySingleList.display();
    }
}
