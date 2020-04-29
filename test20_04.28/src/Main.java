import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-29
 * Time: 23:49
 **/
public class Main {
    public int[] singleNumbers(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] rs = new int[2];
        int k = 0;
        int i = 0, j = 1;
        while (i<=j){
            if (nums[i] == nums[j]){
                if (j == len-1){
                    break;
                }
                i = i + 2;
                j = j + 2;
                if (j >= len){
                    rs[k++] = nums[len - 1];
                    break;
                }
            } else {
                rs[k++] = nums[i];
                i = i + 1;
                j = j + 1;
            }
        }
        return rs;
    }
}
