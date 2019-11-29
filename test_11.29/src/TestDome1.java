/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-27
 * Time: 18:24
 **/
public class TestDome1 {
    public static void walk(Animal animal) {
        animal.eat();
    }
    public static void main(String[] args) {
        Animal animal = new Cat("咪咪");
        walk(animal);
        ((Cat) animal).run();
    }
}
