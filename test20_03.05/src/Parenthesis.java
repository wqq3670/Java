import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-05
 * Time: 20:42
 **/
public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(ch == '(') {
                stack.push(ch);
            }else if(ch == ')'){
                if(stack.empty()) {
                    return false;
                }
                stack.pop();
            }else {
                return false;
            }
        }
        if(stack.empty()) {
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(chkParenthesis(str,str.length()));
    }
}
