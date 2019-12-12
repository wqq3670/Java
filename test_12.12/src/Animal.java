/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-12
 * Time: 21:05
 **/
public class Animal {
    public String name;
    public String color;
    public int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void eat() {
        System.out.println("eat()");
    }
}
