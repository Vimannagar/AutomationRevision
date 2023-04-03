package keywords;

public class Variables {
//	 3 types of variable
	
//	static variable - Variable define with static keyword at class level whose value doesnt gets change from object to object
//	non static variable - Variable without any specific keyword defined at class level whose value gets vary from object to object
//	local variable - Variable which defines between {} except class level this variable can only be accessible with in {} only.
	
	static int i = 50;//static variable
	
	String s = "abc";//non static variable
	
	
	
	public static void main(String[] args) {
		
		System.out.println(i);
		
		System.out.println(Variables.i);
		
		Variables v  = new Variables();
		
		System.out.println(v.s);//abc
		
		v.s = "def";
		
		Variables v1 = new Variables();
		
		System.out.println(v1.s);//abc
		
		System.out.println(v.s);//def
		
		System.out.println(i);//50
		
		System.out.println(v.i);//50
		
		System.out.println(v1.i);//50
		
		v1.i = 60;
		
		System.out.println(v.i);//60
		
		
		int j = 10; // local variable
		
		System.out.println(j);
		
		
	}
	
}
