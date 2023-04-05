package oopsconcept;

public class B extends A
{
	
	public B(int i)
	{
		System.out.println("B class constructor");
	}
	
	public static void main(String[] args) {
		
		
		B b = new B(10);
		
		b.m1();
		
		b.m2();
		
		System.out.println(a);
	}

}
