import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * Description:防辐射服
 * User: dell
 * Date: 2019-12-08
 * Time: 9:43
 **/
public class TestDemo1 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("wqq");
        collection.add("Java");
        collection.add("2019");
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        collection.remove("2019");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

    }
}
