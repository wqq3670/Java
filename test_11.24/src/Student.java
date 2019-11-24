/**
 * Created with IntelliJ IDEA.
 * Description: 实现 Comparable接口
 * User: dell
 * Date: 2019-11-24
 * Time: 9:34
 **/
public class Student implements Comparable<Student>{

    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;      //从小到大
        //return o.age - this.age;      //从大到小
        //return (int)(this.score - o.score);
        //return (int)(o.score - this.score);
        //return this.name.compareTo(o.name);
        return o.name.compareTo(this.name);
        //return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
