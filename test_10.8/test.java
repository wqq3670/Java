public class test{
	public static void main(String[] args){
		
		int num = 5;
		int i = 1;
		int ret = 1;
		int sum = 0;
		int j = 1;
		while(i <= num) {
			
			ret = 1;
			while(j <= i) {
				
				ret *= j;
				j++;
			}
			sum += ret;
			i++;
		}
		
		System.out.println(sum);
		
	}
}
	