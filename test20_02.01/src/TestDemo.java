/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-01
 * Time: 15:20
 **/
public class TestDemo {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，
     * 并返回其索引。如果目标值不存在于数组中，
     * 返回它将会被按顺序插入的位置。
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
//        int[] array = {1,3,5,6};
//        int ret = searchInsert(array,0);
//        System.out.println(ret);
            StringBuilder sb = new StringBuilder();
            sb.append("Hello").append("World");
            fun(sb);
        System.out.println(sb);
    }
    public static void fun(StringBuilder temp) {
        temp.append("\n").append("www.bit.com.cn");
    }
}
