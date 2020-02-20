import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-19
 * Time: 9:15
 **/
public class TestDemo1 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                ret = nums[i];
            }
        }
        return ret;
    }


}
