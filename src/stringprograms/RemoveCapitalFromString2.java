package stringprograms;

public class RemoveCapitalFromString2 {

	public static void main(String[] args) {
		
		String s = "HelLo";
		
		String withoutcaps = "";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			boolean iscaptialletter = Character.isUpperCase(ch);
			
			if(!(iscaptialletter))
			{
				withoutcaps= withoutcaps + ch;
			}
		}
		
		System.out.println(withoutcaps);
		
}
}