/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-07
 * Time: 13:26
 **/
public class TestDome1 {
    public static void main(String[] args) {
        MyArrayLise myArrayLise = new MyArrayLise();
        System.out.println("在pos位置新增元素");
        myArrayLise.add(0,1);
        myArrayLise.add(0,2);
        myArrayLise.add(0,3);
        myArrayLise.add(0,4);
        myArrayLise.add(0,5);
        myArrayLise.display();

        System.out.println("判定是否包含2");
        System.out.println(myArrayLise.contains(2));
        System.out.println("判定是否包含6");
        System.out.println(myArrayLise.contains(6));

        System.out.println("查找1对应的位置");
        System.out.println(myArrayLise.search(1));
        System.out.println("查找8对应的位置");
        System.out.println(myArrayLise.search(8));

        System.out.println("获取3位置的元素");
        System.out.println(myArrayLise.getPos(3));
        System.out.println("获取9位置的元素");
        System.out.println(myArrayLise.getPos(9));

        myArrayLise.display();
        System.out.println("给0位置的元素设为1");
        myArrayLise.setPos(0,1);
        System.out.println("给8位置的元素设为8");
        myArrayLise.setPos(8,8);
        myArrayLise.display();

        System.out.println("删除第一次出现的关键字1");
        myArrayLise.remove(1);
        myArrayLise.display();

        System.out.println("获取顺序表的长度");
        System.out.println(myArrayLise.size());

        System.out.println("清空顺序表");
        myArrayLise.clear();
        myArrayLise.display();




    }
}
