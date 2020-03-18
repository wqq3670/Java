import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-18
 * Time: 18:32
 **/


public class Main2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int cols = s.nextInt();
        String c = s.next();
        int rows = cols/2;
        if(cols%2!=0){
            rows = cols/2+1;//四舍五入
        }
        for(int i = 0 ; i < cols ; i++){//打印第一行
            System.out.print(c);
        }
        System.out.print('\n');//换行
        for(int i = 0 ; i < rows-2;i++){//打印中间
            System.out.print(c);
            for(int j = 0 ; j < cols - 2 ; j++){
                System.out.print(" ");//打印空格
            }
            System.out.print(c);
            System.out.print('\n');//换行
        }
        for(int i = 0 ; i < cols ; i++){//打印最后一行
            System.out.print(c);
        }
    }
}

