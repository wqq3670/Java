import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-04
 * Time: 17:14
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            isRight(str);
        }
    }

    private static void isRight(String str) {
        if(judeglen(str) && judgeRep(str) && judgemoreTwo(str)) {
            System.out.println("OK");
        }else {
            System.out.println("NG");
        }
    }

    private static boolean judgemoreTwo(String str) {
        for (int i = 0; i <= str.length() - 6; i++) {
            for (int j = i + 3; j <= str.length() - 3; j++) {
                if (str.charAt(i)==str.charAt(j) && str.charAt(i + 1) ==str.charAt(j + 1) && str.charAt(i + 2)==str.charAt(j + 2))
                    return false;
            }
        }
        return true;
    }

    private static boolean judgeRep(String str) {
        char[] ch = str.toCharArray();
        int numCount = 0;
        int sLetter = 0;
        int bLetter = 0;
        int otherNum = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a'&& ch[i]<= 'z') {
                sLetter = 1;
            }else if(ch[i] >= 'A'&& ch[i]<= 'Z') {
                bLetter = 1;
            }else if(ch[i] >= '0'&& ch[i]<= '9') {
                numCount = 1;
            }else {
                otherNum = 1;
            }
        }
        if(sLetter+bLetter+numCount+otherNum >= 3) {
            return true;
        }
        return false;
    }

    private static boolean judeglen(String str) {
        if(str.length() > 8) {
            return true;
        }
        return false;
    }
}
