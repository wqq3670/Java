public class Test1 {

    public static void main(String[] args) {
        MyArrayList myarraylist = new MyArrayList();
        myarraylist.add(0,99);
        myarraylist.add(1,88);
        myarraylist.add(2,66);
        myarraylist.add(0,688);
        myarraylist.display();
        System.out.print("是否包含toFind：");
        System.out.println(myarraylist.contains(55));
        System.out.print("toFind元素的下标是：");
        System.out.println(myarraylist.search(66));
        System.out.print("pos 位置的元素:");
        System.out.println(myarraylist.getPos(0));
        System.out.print("顺序表长度：");
        System.out.println(myarraylist.size());
        myarraylist.display();
        System.out.println("给 pos 位置的元素设为 value");
        myarraylist.setPos(0,22);
        myarraylist.display();
        System.out.println("删除toRemove元素");
        myarraylist.remove(99);
        myarraylist.display();
        System.out.println("清空顺序表:");
        myarraylist.clear();
        myarraylist.display();


    }

}