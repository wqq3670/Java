public class TestDemo1 {
    public static void main(String[] args) {

        //不带参数
        Student student1 = new Student();
        student1.age = 10;
        System.out.println(student1.age);
        System.out.println(student1.name);
        student1.read();
        System.out.println(student1);

        //一个参数
        Student student2 = new Student(88);
        student2.age = 66;
        System.out.println(student2.age);
        System.out.println(student2.name);
        student2.study();
        System.out.println(student2);

        //两个参数
        Student student3 = new Student("java",55);
        student3.age = 99;
        student3.name = "sehun";
        System.out.println(student3.age);
        System.out.println(student3.name);
        student3.sleep();
        System.out.println(student3);

        //调用get  set  方法
        Student student4 = new Student();
        student4.setAge(21);
        System.out.println(student4.getAge());
        student4.setName("wsh");
        System.out.println(student4.getName());
        //封装
        student4.setStuNum(19940412);
        System.out.println(student4.getStuNum());
    }
}
