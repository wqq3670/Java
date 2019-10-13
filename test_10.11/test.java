
public class test {
	
	
	//1！+2！+3！+4i！+5！
	public static void main2(String[] args) {
		
		int num = 5;
		int ret = 1;
		int sum = 0;
		for(int i = 1;i <= num;i++) {
			ret = 1;
			for(int j = 1;j <= i;j++) {
				
				ret *= j;
			}
			sum += ret;
		}
		System.out.println("sum = "+sum);
		
	}
	
	//（1-100）奇数和   偶数和
	public static void main1(String[] args) {
		
		int sumOdd = 0;
		
		int sunEve = 0;
		
		for(int i = 1;i < 100;i+=2) {
			
			sumOdd += i;
		}
		for(int j = 2;j <=100;j+=2) {
			
			sunEve += j;
		}
		
		System.out.println("sumOdd = "+sumOdd);
		System.out.println("sunEve = "+sunEve);
	}
	
}