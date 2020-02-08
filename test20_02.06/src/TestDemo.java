import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-06
 * Time: 21:38
 **/
public class TestDemo {
    /**
     * 找出数组中的索引数，这个数左右两边和相等（不算这个数）
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(2*leftSum + nums[i] == sum) {
                return i;
            }else {
                leftSum = leftSum+nums[i];
            }
        }
        return -1;
    }

    /**
     * 给定一个由整数组成的非空数组所表示的非负整数，
     * 在该数的基础上加一。
     * 最高位数字存放在数组的首位,
     * 数组中每个元素只存储单个数字。
     * 你可以假设除了整数 0 之外，这个整数不会以零开头。
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            digits[i]++;
            digits[i] = digits[i]%10;//若此位++后为10，执行此步变为0
            if(digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length+1];//特殊的全为9的情况
        digits[0] = 1;
        return digits;
    }

    /**
     * 给定一个非空数组，返回此数组中第三大的数。
     * 如果不存在，则返回数组中最大的数。
     * @param nums
     * @return
     */
    public static int thirdMax(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return nums[0]>nums[1]?nums[0]:nums[1];
        }

    }
    public static void main(String[] args) {
        int[] num = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(num));
        int[] num1 = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(num1)));
        int[] num2 = {1,2};
        System.out.println(thirdMax(num2));
    }
}
