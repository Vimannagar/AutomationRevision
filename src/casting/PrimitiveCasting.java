package casting;

public class PrimitiveCasting {
	
	
	public static void main(String[] args) {
		
		int i = 10;
		
		long l = (long)i;// implicit casting
		
		
		System.out.println(l);//10
		
		
		int j = 129;
		
		byte b = (byte)j;// explicit casting 
		
	 System.out.println(b);//-127- > Data gets loss
		
		
		
	}

}
