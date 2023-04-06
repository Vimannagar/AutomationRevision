package oopsconcept;

public class Overloading {
	
	public  void m1(String s)
	{
		System.out.println("m1 method with String argument");
	}

	
	public void m1(StringBuffer sb)
	{
		System.out.println("m1 method with String buffer argument");
	}

	public void m2(int i)
	{
		System.out.println("primitive argument method");
	}
	
	public void m2(Integer i)
	{
		System.out.println("nonprimitive argument method");
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		
		o.m1("abc");
		o.m2(10);
		
		
	}
}
