//设计一个包含多个构造函数的类，
// 并分别用这些构造函数来进行实例化对象。

class Student {

    //属性
    public int age;
    public String name;
    private int stuNum;


    //方法
    public void study() {
        System.out.println("敲代码");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void read() {
        System.out.println("看书");
    }

    //构造函数
    public Student() {
       this(5);
        System.out.println("I am Student()");
    }

    public Student (int age) {

        this.age = age;
        System.out.println("I am Student(age)");
    }

    public Student (String name,int age) {

        this.age = age;
        this.name = name;
        System.out.println("I am Student(name,age)");
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }
}
