package methods;

public class StaticMethod {
	
//	1. main method
//	2. Regular method
	
	
//	static 
	
	public static void m1()
	{
		System.out.println("This is static method");
	}
	

	
	public static void main(String[] args) {
		m1();
		
		StaticMethod.m1();
		
		
	}

	
	
}
