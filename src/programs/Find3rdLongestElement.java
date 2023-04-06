package programs;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Find3rdLongestElement {

	
	
	public static void main(String[] args) {
		
		String [] a = {"pune", "Bengaluru", "Delhi", "mumbai", "uri"};
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		for(String aa:a)
		{
			int charactercount = aa.length();
			
			String element = aa;
			
			tm.put(charactercount, element);
				
		}
		
		System.out.println(tm);
		
	Set<Entry<Integer, String>> keyvalues = tm.entrySet();
	int count = 0;
	for(Entry<Integer, String> kv :keyvalues)
	{
		Integer key = kv.getKey();
		String value = kv.getValue();
		count++;
		
		if(count==3)
		{
			System.out.println(value);
		}
	}
		
		
		
		
		
		
	}
}
