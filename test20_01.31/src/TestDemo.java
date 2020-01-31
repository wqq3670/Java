/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-01-31
 * Time: 15:37
 **/
public class TestDemo {
    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static int removeElement2(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        while(i < len) {
            if(nums[i] == val) {
                nums[i] = nums[len-1];
                len--;
            }else {
                i++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] array = {1,2,2,3};
        int ret = removeElement2(array,2);
        System.out.println(ret);
    }
}
