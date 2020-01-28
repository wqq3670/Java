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

    public void rotate2(int[] nums, int k) {
        //新建一个相同大小的数组a
        int[] a = new int[nums.length];
        //利用公式将旋转后每个坐标对应的内容调整好
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        //再次将a数组中的内容放入nums数组中
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
    public static void rotate(int[] nums, int k) {
        //数组扩容
        int[] num = Arrays.copyOf(nums,nums.length*2);
        //在扩容后的数组中将原数组在自己后面在克隆追加一份
        System.arraycopy(nums,0,num,nums.length,nums.length);
        //新数组中找到移动后的结果进行打印
        for (int i = k; i < nums.length + k; i++) {
            System.out.print(num[i]+" ");
        }
    }
    public static void rotate1(int[] nums, int k) {
        //旋转k次（即向右移动k个位置）
        for (int i = 0; i < k; i++) {
            int end = nums[nums.length-1];
            //下面的代码是 每次将整个数组向右移动一个位置
            for (int j = 0; j < nums.length; j++) {
                int tmp = nums[j];
                nums[j] = end;
                end= tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
        //两层循环完成整个逻辑
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,8,9,10,12};
        rotate1(num1,2);
        rotate(num1,3);
    }
}
