public class Test1 {

    public static void main(String[] args) {
        MyArrList myArrList = new MyArrList();
        myArrList.add(0,11);
        myArrList.add(1,22);
        myArrList.add(2,33);
        myArrList.display();
        myArrList.add(0,66);
        myArrList.add(3,88);
        myArrList.add(3,99);
        myArrList.display();

        System.out.print("是否包含88这个数：");
        System.out.println(myArrList.contains(88));
        System.out.print("是否包含12这个数：");
        System.out.println(myArrList.contains(12));

        System.out.print("查找88对应的位置：");
        System.out.println(myArrList.search(88));
        System.out.print("查找4对应的位置:");
        System.out.println(myArrList.search(4));

        myArrList.display();
        System.out.println("给 0 位置的元素设为 28");
        myArrList.setPos(0,28);
        myArrList.display();

        System.out.println("删除出现的关键字22");
        myArrList.remove(22);
        myArrList.display();
        System.out.println("删除出现的关键字8");
        myArrList.remove(8);

        System.out.print("获取顺序表长度:");
        System.out.println(myArrList.size());

        System.out.println("清空顺序表:");
        myArrList.clear();
        myArrList.display();

    }
}
