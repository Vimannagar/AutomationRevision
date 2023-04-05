package categoriesofmethod;

public class MethodWithReturn {
//	method with return and no argument
	public static int m1()
	{
		int a = 10;
		int b = 20;
		
		int c = a+b;
		
		System.out.println(c);
		
		return c;
	}

//	method with return and with argument
	
	
	public static String m2(String s1, int i2)
	{
		 String s2= s1 + i2;
		 return s2;
	}
	
	public static void main(String[] args) {
		 int d = m1() + 20;
		 
		 System.out.println(d);//50
		 
	String e	=  m2("abc", 10);
	
	System.out.println(e);//abc10
	}
}