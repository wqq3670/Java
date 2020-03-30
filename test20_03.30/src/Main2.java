import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-03-30
 * Time: 17:25
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //获取N M
            int N = sc.nextInt();
            int M = sc.nextInt();
            //获取成绩
            int[] score = new int[N];
            for (int i = 0; i < N; i++) {
                score[i] = sc.nextInt();
            }

            sc.nextLine();//清除缓存区
            //获取语句
            String[] statement = new String[M];
            for (int i = 0; i < M; i++) {
                statement[i] = sc.nextLine();
            }
            //读每个语句内容
            for (int i = 0; i < M; i++) {
                String[] str = statement[i].split(" ");
                int a = Integer.valueOf(str[1]);
                int b = Integer.valueOf(str[2]);
                if (str[0].equals("Q")) {
                    System.out.println(findMax(score, a - 1, b - 1));
                }
                if (str[0].equals("U")) {
                    score[a - 1] = b;
                }
            }
        }
    }

    private static int findMax(int[] score, int a, int b) {
        int max = score[a];

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (score[i] > max) {
                    max = score[i];
                }
            }
        } else {
            for (int i = a; i >= b; i--) {
                if (score[i] > max) {
                    max = score[i];
                }
            }


        }
        return max;
    }
}

