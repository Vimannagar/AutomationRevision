package stringprograms;

import java.util.ArrayList;

public class RemoveDuplicatesFromString {
	
	
	public static void main(String[] args) {
		
		String s = "pennsylvania";
		String unique = "";
		ArrayList<Character> al = new ArrayList<Character>();
		for(int i =0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(al.contains(ch))
			{
				continue;
			}
			else
			{
				al.add(ch);
				unique= unique+ch;
			}
			
			
			
		}
		
		System.out.println(unique);
	}

}
