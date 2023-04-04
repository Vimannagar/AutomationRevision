package constructor;

public class Test {
	int value;
	int count;
	
	public Test()
	{
		System.out.println("zero argument constructor");
	}
	
	public Test(int i)
	{
		this();
		System.out.println("Int argument constructor");
	}
	
	Test(int i, int j)
	{
		value = i;
		
		count  = j;
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		
		Test t1 = new Test(20);
		
		Test t2 = new Test(10, 20);
		
		
	}

}
