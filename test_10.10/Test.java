
import java.util.Scanner;
import java.util.Random;


public class Test {
	
	public static void game() {
		
		int toGuess = random.nextInt(100);
			while(true) {
				System.out.print("请输入你猜的数字：");
			    int myGuess = nextInt();
				if(myGuess < toGuess) {
					
					System.out.println("猜小了！");
				}else if(myGuess > toGuess) {
					
					System.out.println("猜大了！");
				}else {
					System.out.println("猜对了！");
					break;
				}	
			}
		}
				
		public static void menu() {
			//菜单
			System.out.print("------------------");
			System.out.print("----- 1.play -----");
			System.out.print("----- 0.exit -----");
			System.out.print("------------------");
		}
		
		
		
	public static void main(String[] args) {
		
		int input = 0;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int toGuess = random.nextInt(100);
		
		do {
			menu();
			System.out.print("请选择：");
			input = sc.nextInt();
			switch(input) {
				
				case 1:
				    game();
					break;
				case 0:
				    System.out.println("退出游戏！"); 
					break;
				default :
					System.out.println("输入错误，请重新输入！");
					break;
			}
			
		}while(input > 0);
	sc.close();	
	}
	
	//13. 输出一个整数的每一位.
	public static void main15(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int n = sc.nextInt();
		
		while(n > 0) {
			System.out.print((n%10)+" ");
			n /= 10;
		}
		sc.close();
	}
	
	//12. 获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列。 
	public static void main14(String[] args) {
		
		int [] Odd = new int[17];
		int [] Eve = new int[17];
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int n = sc.nextInt();
		int j = 0;
		int k = 0;
		System.out.println(n);
		//奇数位
		for(int a = 0;a < 32;a+=2) {
			Odd[j] = ((n>>a)&1);
			j++;
		}
		System.out.println();
		//偶数位
		for(int b = 1;b < 32;b+=2) {
			Eve[k] = ((n>>b)&1);
			k++;				
		}
		
		System.out.print("奇数数列为：");
		for(int i = 15;i >= 0;i--) {
			System.out.print(Odd[i]+" ");
		}
		System.out.println();
		
		System.out.print("偶数数列为: ");
		for(int i = 15;i >= 0;i--) {
			System.out.print(Eve[i]+" ");
		}
		sc.close();
	}
	
	//11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
	public static void main13(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int num = sc.nextInt();
		int ret = funRet(num);
		System.out.println("返回二进制中1的个数为："+ret);
		//sc.close();
	}
	
	public static int funRet(int n) {
		
		int count = 0;
		for(int i = 0;i < 32;i++) {
			
			if(((n>>i)&1) == 1) {
				
				count++;
			}
		}
		return count;
	}
	
	//10. 编写代码模拟三次密码输入的场景。 
	//最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 
    //入，最多输入三次。三次均错，则提示退出程序 
	public static void main12(String[] args) {
		
		String str1="Hello Java";
		int i = 0;
		for(i = 0;i < 3;i++) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("请输入密码：");
			String str2 = sc.nextLine();
			if(str1.equals(str2)==true) {
				break;
			}	
		}
		if(i < 3) {
				System.out.println("登录成功");
			}else {
				System.out.println("输入密码错误，退出程序！");
		}
		//sc.close();		
	}
	
	//9. 求出0～999之间的所有“水仙花数”并输出。
	//(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 
    //身，如；153＝1＋5＋3?，则153是一个“水仙花数”。)
	public static void main11(String[] args) {
	
		for(int i = 1;i <= 999;i++) {
			
			int count = 1;
			int tmp = i;
			double sum = 0.0;
			
			//1.计算个数
			while(tmp/10 > 0) {
				
				count++;
				tmp /= 10;
			}
			tmp = i;
			
			//求和
			while(tmp > 0) {
				
				sum += Math.pow(tmp%10,count);
				tmp /= 10;
			}
			
			//判断是否为水仙花数
			if(i == sum) {
				System.out.print(i+" ");
			}
		}
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
