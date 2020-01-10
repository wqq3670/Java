public class Test {
	public static void main(String[] args) {
		for(int i = 0;i < args.length; i++) {
			System.out.println(args[i]);
		}
		int a = 10;
		long b = 50L;
		double c = 5.2D;
		float d = 1.2F;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("hello Java!");
		System.out.println("My name is:"+args[0]);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
    }   
}