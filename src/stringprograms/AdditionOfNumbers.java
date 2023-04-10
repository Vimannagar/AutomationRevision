package stringprograms;

public class AdditionOfNumbers {
	
	public static void main(String[] args) {
		
		String s = "dhas12dj2sajdjsa56sa12das";
		String number= "";
		int sum= 0;
		boolean isnumberfound = false;
	for(int i =0; i<s.length(); i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
		number = number+ s.charAt(i);
		
		isnumberfound = true;
		
		if(i!=(s.length()-1))
		{
			continue;
		}
		}
		
		if(isnumberfound)
		{
			int j = Integer.parseInt(number);
			
			number = "";
			
			sum= sum + j;
			
			isnumberfound = false;
		}
		}
		
	System.out.println(sum);
		
	}
	
	
		
		
	}


