package collectiondisc;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
	
	
	public static void main(String[] args) {
		ArrayList<String> asia = new ArrayList<String>();
		
		asia.add("India");
		asia.add("Japan");
		asia.add("UAE");
		asia.add("Srilanka");
		
		ArrayList<String> apec = new ArrayList<String>();
		
		apec.addAll(asia);
		apec.add("Australia");
		apec.add("Fiji");
		
		System.out.println(apec);
		
		
//		apec.removeAll(asia);
		
//		System.out.println(apec);
		
		
		apec.retainAll(asia);
		
		System.out.println(apec);
		
	boolean	isIndiaPresent= apec.contains("India");
	
	System.out.println(isIndiaPresent);//true
	
	String value = apec.get(1);
	
	System.out.println(value);//Japan
	
	int numberofelements = apec.size();
	
	System.out.println(numberofelements);
	
	for(int i=0; i<apec.size(); i++ )
	{
		String country = apec.get(i);
		
		System.out.println(country);
		
	}
	
	
	for(String s:apec)
	{
		System.out.println(s);
	}
		
	}
	
	

}
