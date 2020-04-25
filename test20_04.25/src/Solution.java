import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-25
 * Time: 23:50
 **/
public class Solution {

    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int count=0;

        for(int i=0;i<array.length;i++){
            if(array[i]==array[array.length/2]){
                count++;
            }
        }
        if(count>array.length/2){
            return array[array.length/2];
        }else{
            return 0;
        }

    }
}
