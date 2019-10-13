
public class test {
	
	public static void main (String[] args) {
	
		int ret = 0;
		ret = fun4(5);
		System.out.println(ret);	
	}
	
	public static int fun4 (int num) {
		
		if(num == 1 || num == 2) {
			
			return num;
			 
		}
		return fun4(num-2)+fun4(num-1);	
		
	}
	
	
	public static void main3 (String[] args) {
	
		int ret = fun3(1729);
		System.out.println(ret);
	}
	public static int fun3 (int num) {
		if(num <= 9) {
			return num;
		}
		return (num%10)+fun3(num/10);
	
	}
		
	public static void main2 (String[] args) {
		
		int ret = sum(10);
        System.out.println(ret);
	}
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
        return n + sum(n-1);
	}

	
	/*
	public static void main1 (String[] args) {
		
		fab(1234);	
	}
	public static void fab(int n) {
			
			if(n > 9) {
				
				fab(n/10);
			}
			System.out.println(n%10);
		}*/ 
}
