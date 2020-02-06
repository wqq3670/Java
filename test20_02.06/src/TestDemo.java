/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-06
 * Time: 21:38
 **/
public class TestDemo {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
