import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-19
 * Time: 17:48
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        for(int i = 0; i < 10; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 1; i < 10; i++){
            if(num[i] != 0){
                System.out.print(i);
                num[i]--;
                break;
            }
        }
        while(num[0] != 0){
            System.out.print(0);
            num[0]--;
        }
        for(int i = 1; i < 10; i++){
            while(num[i] != 0){
                System.out.print(i);
                num[i]--;
            }
        }
    }
}
