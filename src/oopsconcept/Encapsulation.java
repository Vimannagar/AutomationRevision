package oopsconcept;

public class Encapsulation {
	
	
	private int i = 10;
	private	int j = 20;
	
	public void getI()
	{
		System.out.println(i);
	}
	
	public void setI(int k)
	{
		i= k;
	}

	
	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		
		e.getI();
		
	}
}
