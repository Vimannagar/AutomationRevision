package stringprograms;

public class PrintWordStartsWith {
	
	
	public static void main(String[] args) {
		String s = "this is there";
		
		String [] sarray = s.split(" ");
		
	for(int i = 0; i<sarray.length; i++)
	{
		 boolean isstartingwithth = sarray[i].startsWith("th");
		 
		 if(isstartingwithth)
		 {
			 System.out.println(sarray[i]);
		 }
	}
		
	}

}
