package stringprograms;

public class SwapThePairs {
	
	public static void main(String[] args) {
		int a [] = {10, 20, 40, 60};
		
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			if(i%2==0)
			{
			temp = a[i];
			
			a[i] = a[i+1];
			
			a[i+1] = temp;
			}
			
		}
		
		for(int aa:a)
		{
			System.out.println(aa);
		}
	}

}
