package exceptionhandling;

public class Test {
	
	public static void main(String[] args) {
		
		
//		try - catch 
		
		try {
		String s = "one";
		
		int  i = Integer.parseInt(s);
		
		System.out.println(i);//1
		}
		
	
		
		catch(ArithmeticException e )
		{
			System.out.println("This is Arithmetic exception catch block");
			
		}
		
		catch(NullPointerException e )
		{
			System.out.println("This is null pointer  exception catch block");
			
		}
		
		
				
		finally {
			System.out.println("This is finally block");
		}
		
		System.out.println("After the catch block");
	}

}
