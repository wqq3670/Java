import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:测试Comparable接口
 * User: dell
 * Date: 2019-11-24
 * Time: 9:33
 **/
public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("sehun",25,88.8);
        students[1] = new Student("chen",28,66.6);
        students[2] = new Student("do",26,99.9);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }
}
