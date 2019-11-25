import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-25
 * Time: 20:24
 **/
public class Test1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("sehun",25,99.9);
        students[1] = new Student("chanyol",27,88.8);
        students[2] = new Student("xinmin",28,66.6);
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
