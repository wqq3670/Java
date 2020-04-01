import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dell
 * Date: 2020-04-01
 * Time: 12:05
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //获取学科数
        int subject = sc.nextInt();
        //获取学分
        int[] credit = new int[subject];
        for (int i = 0; i < subject; i++) {
            credit[i] = sc.nextInt();
        }
        //获取成绩
        int[] score = new int[subject];
        for (int i = 0; i < subject; i++) {
            score[i] = sc.nextInt();
        }
        double GPA = getAllgradePoint(credit,score);
        System.out.printf("%.2f",GPA);
    }

    private static double getAllgradePoint(int[] credit,int[] score) {
        //计算各科对应绩点
        double[] pointAverage = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            if(score[i]>=90 && score[i]<=100) {
                pointAverage[i] = 4.0;
            }else if(score[i]>=85 && score[i]<=89) {
                pointAverage[i] = 3.7;
            }else if(score[i]>=82 && score[i]<=84) {
                pointAverage[i] = 3.3;
            }else if(score[i]>=78 && score[i]<=81) {
                pointAverage[i] = 3.0;
            }else if(score[i]>=75 && score[i]<=77) {
                pointAverage[i] = 2.7;
            }else if(score[i]>=72 && score[i]<=74) {
                pointAverage[i] = 2.3;
            }else if(score[i]>=68 && score[i]<=71) {
                pointAverage[i] = 2.0;
            }else if(score[i]>=64 && score[i]<=67) {
                pointAverage[i] = 1.5;
            }else if(score[i]>=60 && score[i]<=63) {
                pointAverage[i] = 1.0;
            }else if(score[i] < 60) {
                pointAverage[i] = 0.0;
            }
        }
        //求绩点和
        double pointAverageSum = 0.0;
        for (int i = 0; i < pointAverage.length; i++) {
            pointAverageSum += pointAverage[i]*credit[i];
        }
        //求学分和
        int creditSum = 0;
        for (int i = 0; i < credit.length; i++) {
            creditSum += credit[i];
        }
        return pointAverageSum/(double)creditSum;
    }
}
