/**

文档注释：
一般放在类前面 或者方法前面。
说明类，



有道云笔记
印象笔记
笔记？？

javac   java    javap  

jps   jmap ......

单分支
双分支
多分支
*/

public class Test {
	
	public static void main(String[] args) {
		//1!+2!+3!+4!+5!  ????
		
		int num = 5;
		int i = 1;
		int ret = 1;
		int sum = 0;
		//i: 1 2 3 4  5 
		while(i <= num) {
			
			ret = 1;
			//阶乘：1！ 2！ 3！
			int j = 1;
			while(j <= i) {
				ret *= j;
				j++;
			}
			
			sum += ret;
			i++;
		}
		System.out.println("sum == " + sum);
		
	}
	
	
	public static void main7(String[] args) {
		int num = 5;
		int i = 1;
		int ret = 1;
		while(i <= num) {
			ret *= i;
			i++;
		}
		System.out.println("ret == " + ret);
		
		/*
		int i = 1;
		while(i <= 10) {
			System.out.println("i == " + i);
			i++;//
		}
		
		
		while(true) {
			System.out.println("JAVA20 666!");
		}//ctr+c 中断程序
		*/
	}
	
	
	public static void main6(String[] args) {
		
		//面试问题：能做switch()参数的有哪些类型？
		//byte  char  short  int   String  枚举
		
		//不能做switch参数的类型：long  float  double
		//boolean   
		
		
		String  a = "hello";
		switch(a) {
			case "hello":
				System.out.println("1");
				break;
			case "bit":
				System.out.println("2");
				break;
			default:
				System.out.println("error");
				break;
		}
		
		
	}
	
	public static void main5(String[] args) {
		
		int x = 20;
		int y = 10;
		if (x == 10) {
			if (y == 10) {
				System.out.println("aaa");
			}else {
				System.out.println("bbb");
			}	
		}
			
		
		/*
		int a = 10;
		//if(布尔表达式)
		if(a > 10){
			System.out.println("a > 10");
		}else if(a == 10){
			System.out.println("a == 10");
		}else {
			System.out.println("a < 10");
		}
		
		int b = 10;
		if(b > 10){
			System.out.println("b == 10");
		}
		*/
		
	}
	
	
	public static void main4(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int ret = a > b ? a : b;
		System.out.println(ret);
		
		//System.out.println(-1>>>1);
		//1111111111111111111111111111111111
		//0111111111111111111111111111111111
		
		//int a = 012;
		//System.out.printf("%d\n", a);
		
		//int a = 10;
		//int b = 20;
		//int c = 30;
		//System.out.println(!a < b);
		
		//System.out.println(10 > 20 && 10 / 0 == 0); // 打印 false
		//System.out.println(10 < 20 || 10 / 0 == 0);
		
		//System.out.println(10 > 20 & 10 / 0 == 0); // 打印 false
		//System.out.println(10 < 20 | 10 / 0 == 0);
	}
	
	public static void main3(String[] args) {
		
		
		
		int a = 10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a <= b);
		System.out.println(a >= b);
		System.out.println(a > b);
		System.out.println(a < b);
	}
	
	
	public static void main2(String[] args) {
		
		/*
		int a = 10;
		a = a++;
		System.out.println(a);//10??
		
		//Java 的反汇编   javap -c Test
		
		
		int a = 10;
		a += 1;//a = a+1;
		System.out.println(a);
		
		
		System.out.println(10.0%1.5);
		
		
		System.out.println(10%3);//1
		System.out.println(10%-3);//-1
		System.out.println(-10%3);//-1
		System.out.println(-10%-3);//1
		*/
	}
	
	
	public static void main1(String[] args) {
		
		int a = 10;
		int b = 0;
		try {
			//放的是 可能会发生异常的代码
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			//打印异常信息。
		}
		System.out.println("Java20 gogogo!");
	} 
}
