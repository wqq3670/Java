import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-30
 * Time: 16:45
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int monsterNum = sc.nextInt();
            int person = sc.nextInt();
            int[] monster = new int[monsterNum];
            for (int i = 0; i < monsterNum; i++) {
                monster[i] = sc.nextInt();
            }
            plus(person,monster);
        }
    }

    private static void plus(int person, int[] monster) {
        for (int i = 0; i < monster.length; i++) {
            if(person >= monster[i]) {
                person = person+monster[i];
            }else {
                person = person + commonDivisor(person,monster[i]);
            }
        }
        System.out.println(person);
    }

    /**
     * 求最大公因数
     * @param person
     * @param monster
     * @return
     */
    private static int commonDivisor(int person, int monster) {
        while(person != 0) {
            int tmp = monster % person;
            monster = person;
            person = tmp;
        }
        return monster;
    }
}
