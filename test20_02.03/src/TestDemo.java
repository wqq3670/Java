import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-03
 * Time: 15:48
 **/
public class TestDemo {
    /**
     * 1.你的朋友正在使用键盘输入他的名字name。
     * 偶尔，在键入字符c时，按键可能会被长按，而字符可能被输入 1 次或多次。
     * 你将会检查键盘输入的字符typed。
     * 如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
     * @param name
     * @param typed
     * @return
     */
    public static boolean isLongPressedName(String name, String typed) {
        char[] ch1 = name.toCharArray();
        char[] ch2 = typed.toCharArray();
        int p1 = 0;
        int p2 = 0;
        while(p1 < ch1.length && p2 < ch2.length) {
            if(ch1[p1] == ch2[p2]) {
                p1++;
            }
            p2++;
        }
        return p1 == ch1.length;
    }
    /**
     * 2.给定一个整数数组，判断是否存在重复元素。
     * 如果任何值在数组中出现至少两次，返回 true。
     * 如果数组中每个元素都不相同，则返回 false。
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);//对数组进行排序
        //遍历数组，前后两两相互比较若出现相等，返回true
        for (int i = 0; i < nums.length-1; i++) {//防止数组越界
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    /**
     * 3.给定一个按非递减顺序排序的整数数组A,
     * 返回每个数字的平方组成的新数组,要求也按非递减顺序排序。
     * @param A
     * @return
     */
    public static int[] sortedSquares(int[] A) {
        int[] ret = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 0) {
                ret[i] = Math.abs(A[i])*Math.abs(A[i]);
            }else {
                ret[i] = A[i]*A[i];
            }
        }
        Arrays.sort(ret);
        return ret;
    }
    /**
     * 4.给定一个字符串 S，返回 “反转后的” 字符串，
     * 其中不是字母的字符都保留在原地，
     * 而所有字母的位置发生反转。
     * @param S
     * @return
     */
    public static String reverseOnlyLetters(String S) {
        if(S == null || S.length() == 0) {
            return null;
        }
        char[] ch = S.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left < right) {
            //将left指向对应是字母的位置
            while(left < right && !isLetter1(ch[left])) {
                left++;
            }
            ////将right指向对应是字母的位置
            while(left < right && !isLetter1(ch[right])) {
                right--;
            }
            //将两个字母交换
            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;
        }
        return new String(ch);
    }
    /**
     * 判断字符是否为字母
     * @param c
     * @return
     */
    private static boolean isLetter1(char c) {
        return (c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A');
    }
    public static void main(String[] args) {
        int[] nums = {-8,-3,1,2,3,4,5};
        //Boolean ret = containsDuplicate(nums);
        //System.out.println(ret);
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
