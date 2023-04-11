package stringprograms;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray2 {
	
	
	
	public static void main(String[] args) {
		Integer [] a = {45, 52, 45, 2, 65, 52};
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			if(al.contains(a[i]))
			{
				continue;
			}
			else
			{
				al.add(a[i]);
			}
		}
		
		System.out.println(al);
		
		
	}

}
