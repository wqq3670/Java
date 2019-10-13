
import java.util.Scanner;

public class Test {
	//9. 求出0～999之间的所有“水仙花数”并输出。
	//(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 
    //身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
	
	public static void main(String[] args) {
	
		//1.计算个数
		int count = 1;
		for(int i = 1;i <= 999;i++) {
			
			while(i/10 > 0) {
				count++;
				i /= 10;
			}
		}
		
		//2.判断是否为水仙花数
		
		// int sum =0;
		
		// for(int i = 1;i <= 999;i++) {
		
			// if(i <= 9) {
				
				// System.out.println(i);
			// }else {
				// int tmp = i;
				// while(tmp/10 != 0) {
					
					// sum += tmp%10;
					// tmp /= 10;	
				// }
				
				// if(i == sum) {
					
					// System.out.println(i);	
				// }
				
			// }
			
		// }
			
		
	}
	
	
	//8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。 
	public static void main10(String[] args) {
		
		int count = 0;
		for(int i = 1;i <= 100;i++) {
			
			if(i % 10 == 9) {
				count++;
			}
			if(i / 10 == 9) {
				count++;
			}	
		}
		System.out.println("出现9的个数是："+count);
	}
	
	//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。 
	public static void main9(String[] args) {
		
		int i = 0;
		double sumOdd = 0.0;
		double sumEve = 0.0;
		double sum = 0.0;
		
		for(i = 1;i <= 100;i+=2) {
			//计算分母是奇数的和
			sumOdd += (1.0)/i;	
		}
		for(i = 2;i <= 100;i+=2) {
			//计算分母是偶数的和
			sumEve += (1.0)/i;	
		}
		sum = sumOdd - sumEve;
		System.out.println(sum);
	}
	
	
	//6. 求两个正整数的最大公约数 
	public static void main8(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		int c = 0;
		while(a % b != 0) {
			
			c = a % b;
			a = b;
			b = c;
		}
		System.out.println("两个数的公约数是：");
		System.out.println(c);
		sc.close();
	}
	
	//5. 输出乘法口诀表
	public static void main7(String[] args) {
		
		for(int i = 1;i <= 9;i++) {
			
			for(int j = 1;j <= i;j++) {
				
				System.out.printf("%d*%d=%-2d ",i,j,i*j);	
			}
			System.out.println();
		}	
	}
	
	//4. 输出 1000 - 2000 之间所有的闰年 
	public static void main6(String[] args) {
		
		int year = 0;
		for(year = 1000;year <= 2000;year++) {
			
			if(((year % 4 ==0)&&(year % 100 != 0)) ||(year % 400 ==0)) {
				
				System.out.print(year+" ");
			}
		}	
	}
	
	//3. 打印 1 - 100 之间所有的素数
	public static void main5(String[] args) {
		 
		int i = 1;
		int j = 2;
		
		for(i = 1; i <= 100; i++) {
			
			for(j = 2; j <= i; j++) {
			
				if(i % j == 0) {
				
					break;
				}
			}		
			if(i == j) {
				
				System.out.println(i);
			}
		}	
	}
	
	//2. 判定一个数字是否是素数 
	public static void main4(String[] args) {
		
		int i = 2;
		int num  = 20;
		
		for(i = 2; i <= num; i++) {
			
			if(num % i == 0) {
				
				break;
				
			}
	    }		
	    if(i == num) {
				
		    System.out.println("是素数");
		}else {
		
			System.out.println("不是素数");
		}
	}
	
	//1. 根据年龄, 来打印出当前年龄的人
	//少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
	public static void main3(String[] args) {
		
		int age = 50;
		if(age <= 18) {
			System.out.println("少年");
		}
		if (age >= 19 && age <= 28) {
			System.out.println("青年");
		}
		if (age >= 29 && age <= 55) {
			System.out.println("中年");
		}
		if (age >= 56) {
			System.out.println("老年");
		}	
	}
	
	//给定三个 int 变量, 求其中的最大值和最小值. 
	public static void main2(String[] args) {
		
		int m = 150;
		int n = 20;
	    int k = 80;
		int max = 0;
		int min = 0;
		if(m >= n) {
			max = m;
			min = n;	
		}else {
			max = n;
			min = m;
		}
		if(k >= max) {
			max = k;
		}
		else if(k <= min) {
			min = k;
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}
	
	// 给定两个 int 变量, 交换变量的值. 
	public static void main1(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 0;
		
		System.out.println("交换前：");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		c = a;
		a = b;
		b = c;
		System.out.println("交换后：");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
	
}
