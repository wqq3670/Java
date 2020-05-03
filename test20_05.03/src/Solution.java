/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-03
 * Time: 18:11
 **/
public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(sum > 0) {
                sum += nums[i];
            }else {
                sum = nums[i];
            }
            max = Math.max(max,sum);
        }
        return max;

    }
}
