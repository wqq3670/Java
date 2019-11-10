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
//        mySingleList.addFirst(5);
//        mySingleList.addFirst(4);
//        mySingleList.addFirst(4);
//        mySingleList.addFirst(3);
//        mySingleList.addFirst(1);
//        //mySingleList.addLast(6);
//        mySingleList.display();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        //mySingleList.addLast(4);
        mySingleList.addLast(4);
        mySingleList.addLast(2);
        mySingleList.addLast(1);
        mySingleList.display();
        //       mySingleList.addLast(6);
//        mySingleList.addLast(7);
//        mySingleList.display();
//        System.out.println(mySingleList.contains(2));
//        System.out.println(mySingleList.contains(15));
//        mySingleList.addIndex(0,2);
//        mySingleList.addIndex(8,2);
//        mySingleList.addIndex(4,2);
//        mySingleList.display();
//        mySingleList.remove(3);
//        mySingleList.display();
//        mySingleList.removeAllKey(2);
//        mySingleList.display();
//        System.out.println(mySingleList.size());
//        ListNode node = mySingleList.reverseList();
//        mySingleList.displaynew(node);
//        ListNode node = mySingleList.middleList();
//        System.out.println(node.data);
//        System.out.println(mySingleList.findthToTail(2).data);
        //System.out.println(mySingleList.findthToTail(0).data);
//        System.out.println(mySingleList.findthToTail(5).data);

//        ListNode bs = mySingleList.partition(3);
//        mySingleList.displaynew(bs);
//        ListNode node = mySingleList.partition(4);
//        mySingleList.displaynew(node);
//        ListNode newHead = mySingleList.deleteDuplication();
//        mySingleList.displaynew(newHead);
        System.out.println(mySingleList.chkPalindrome());

    }
}
