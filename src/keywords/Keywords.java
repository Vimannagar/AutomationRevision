package keywords;

public class Keywords extends ParentKeyword{

//	this keyword: 
	
	
	int i = 50;
	
	static int j = 90;
	
	int k = 10;
	
	public void m1()
	{
		int i = 60;
		System.out.println(i);//60
		
		System.out.println(this.i);// it is used to access global variable inside the non static area
		System.out.println(this.j);
		
		int k = 100;
		System.out.println(k);//100
		
		System.out.println(this.k);//10
		
		System.out.println(super.k);//70
	}
	
	public static void main(String[] args) {
		
		Keywords k = new Keywords();
		
		k.m1();
		
//		System.out.println(this.i);// this is invalid as we can access it only inside the non static area.
		
		
//		System.out.println(super.k);// this is invalid as we can access it only inside the non static area.
		
	}
	
//	WAP to check a number is palindrome or not
//	WAP to find factorial of a number
	
	
}
