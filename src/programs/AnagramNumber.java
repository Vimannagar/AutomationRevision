package programs;

import java.util.Arrays;

public class AnagramNumber {
	
	
	public static int[] numberToArray(int number)
	{
		int count =0;
		int [] c = new int [3];
	
		while(number!=0)
		{
			int remainder = number% 10;
			
			number = number/10;
			
			c[count] = remainder;
			
			count++;
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		int a = 123;
		
		int b= 112;
		
		int array1[]  = numberToArray(a);
		int array2[]  = numberToArray(b);
		
		Arrays.sort(array1);
		Arrays.sort(array2);
	int	count = 0;
		for(int i = 0; i<array1.length; i++)
		{
			if(array1[i] == array2[i])
			{
				count ++;
			}
			else {
				System.out.println("number is not anagram");
			break;
			}
			
			
			if(count ==array1.length)
			{
				System.out.println("number is anagram");
			}
			
			
		}
		
		
		
	}

}
