package stringprograms;

public class RemoveCapitalFromString {
	
	
	public static void main(String[] args) {
		
		String s = "HelLo";
		
		String withoutcaps = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			int asciivalue = (int)ch;
			
			if(!(asciivalue>=65 && asciivalue<=90))
			{
				withoutcaps = withoutcaps +ch;
			}
		}
		
		System.out.println(withoutcaps);
		
		
		
		
		
		
	}

}
