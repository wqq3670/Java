import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-05-02
 * Time: 16:04
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lengthOfLongestSubstring(sc.nextLine());
        System.out.println(n);
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLen = 0;
        int end = 0;
        int start = 0;
        Set<Character> set=new HashSet<>();
        while(start<len && end<len){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }else{
                set.add(s.charAt(end));
                end++;
                maxLen=Math.max(maxLen,end-start);
            }
        }
        return maxLen;
    }

}
