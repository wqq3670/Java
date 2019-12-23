import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2019-12-08
 * Time: 10:13
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","刘亦菲");
        map.put("国民闺女","李知恩");
        map.put("国民男神","吴世勋");
        map.put("国民锦鲤","杨超越");
        System.out.println(map);
        String str = map.getOrDefault("国民闺女1","杨紫");
        System.out.println(str);
        System.out.println(map.containsKey("国民男神"));
        System.out.println(map.containsValue("吴世勋"));

        for(Map.Entry<String,String>entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
