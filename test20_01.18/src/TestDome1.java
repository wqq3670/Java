import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-01-18
 * Time: 14:11
 **/
public class TestDome1 {
    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置
     * 其中 k 是非负数。
     */
    public static void rotate1(int[] nums, int k) {
        //数组扩容
        int[] num = Arrays.copyOf(nums,nums.length*2);
        //在扩容后的数组中将原数组在自己后面在克隆追加一份
        System.arraycopy(nums,0,num,nums.length,nums.length);
        //新数组中找到移动后的结果进行打印
        for (int i = k; i < nums.length + k; i++) {
            System.out.print(num[i]+" ");
        }
    }
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int end = nums[nums.length-1];
            for (int j = 0; j < nums.length; j++) {
                int tmp = nums[j];
                nums[j] = end;
                end= tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,5,6,7};
        rotate1(num1,2);
    }
}
