package stringprograms;

public class SumOfNumbersFromString {
	
	
	public static void main(String[] args) {
		String s = "d58ds9f9sfs9fs7f";
		String ss = "";
		int sum =0;
		for(int i= 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				ss = ss+ch;
				
				int value = Integer.parseInt(ss);
				
				sum= sum + value;
				
				ss = "";
			}
			
			
		}
		
		System.out.println(sum);
	}

}
