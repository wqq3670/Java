/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-27
 * Time: 18:28
 **/
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name+"eat()");
    }
}
