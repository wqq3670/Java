import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-02-02
 * Time: 15:56
 **/
public class TestDemo {
    //赚赎金
    public static boolean canConstruct(String ransomNote, String magazine) {
        //定义一个数组用来表示26个字母
        int[] ch = new int[26];
        //遍历源字符串，得到的字母在数组对应位置上进行++
        for (int i = 0; i < magazine.length(); i++) {
            ch[magazine.charAt(i) - 'a']++;
        }
        //遍历要找的字符串，得到的字母在数组对应位置上进行--
        for (int i = 0; i < ransomNote.length(); i++) {
            ch[ransomNote.charAt(i) - 'a']--;
        }
        //对数组进行遍历，如果发现有<0的位，
        // 即要找的字符串中没有或缺少源字符串的相对应的字母
        for (int i = 0; i < 26; i++) {
            if(ch[i] < 0) {
                return false;
            }
        }
        return true;
    }
    //合并两个有序的数组
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(num1,3,num2,3);
    }
}
