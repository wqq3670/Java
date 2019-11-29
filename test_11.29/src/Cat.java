/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-11-27
 * Time: 18:28
 **/
public class Cat extends Animal implements IRunning{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name+"在跑步");
    }
}
