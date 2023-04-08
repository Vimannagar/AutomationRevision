package casting;

public class Child extends Parent
{
	public void m1()
	{
		System.out.println("m1 method from child class");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		Parent pp = (Parent)c;// up casting
		
		pp.m1();
		
		
		
		Parent p = new Parent();
		
//		Child cc = (Child)p;// downcasting - > not possible directly
		
		Child ccc = (Child)pp;// Downcasting --> indirectly
		
	}

}
