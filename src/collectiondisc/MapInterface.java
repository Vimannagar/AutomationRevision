package collectiondisc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {
	
	
	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Rupee", "India");
		hm.put("Dollar", "USA");
		hm.put("Pound", "UK");
		hm.put("Bhat", "Thailand");
		
		
		System.out.println(hm);
		
		hm.put("Pound", "Britain");
		
		System.out.println(hm);
		
		hm.put("peso", "Thailand");
		
		
		System.out.println(hm);
		
		Set<String> keys = hm.keySet();//to get all keys 
		
		for(String key:keys)
		{
			System.out.println(key);
		}
		
		Collection<String> value = hm.values();// to get all values 
		
		
		for(String v:value)
		{
			System.out.println(v);
		}
		
		
		boolean ispresent = hm.containsKey("Rupee");
		
		System.out.println(ispresent);//true
		
		
		boolean ispresents = hm.containsValue("UK");
		
		System.out.println(ispresents);//false
		
		
	Set<Entry<String, String>> keyvalue = hm.entrySet();
	
	for(Entry<String, String> kv :keyvalue)
	{
		String keyss = kv.getKey();
		
		String valuees = kv.getValue();
		
		System.out.println(keyss+" "+valuees);
	}
	
	
	}

}
