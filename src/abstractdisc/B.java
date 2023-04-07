package abstractdisc;

public class B extends A
{

	
	public void m3() {
		System.out.println("m3 method defined by B class");
		
	}
	
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.m3();
		b.m1();
		b.m2();
		
		
		
	}
	
	

}
