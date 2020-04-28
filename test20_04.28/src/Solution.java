import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:数组中数字出现的次数
 *
 * 一个整型数组 nums 里除两个数字之外，
 * 其他数字都出现了两次。请写程序找出这两个只出现一次的数字。
 * 要求时间复杂度是O(n)，空间复杂度是O(1)。

 * User: dell
 * Date: 2020-04-28
 * Time: 17:08
 **/
public class Solution {
    public static void main(String[] args) {

    }
    public static int[] singleNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        int j = 0;
        while(j < nums.length-1) {
            if(nums[j] != nums[j+1]) {
                list.add(nums[j]);
            }else {
                j++;
            }
            j++;
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;

    }
}
