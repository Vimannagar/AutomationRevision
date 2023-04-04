package methods;

public class NonStaticMethod {
	
	
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("non static block");
	}
	
//	non static method
	
	
	
	public void m2()
	{
		System.out.println("non static method");
	}
	
	
	public static void main(String[] abc) {
		
		
		System.out.println("String");
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		
	}
	
	public static void main() {
		
	}
	
	

}
