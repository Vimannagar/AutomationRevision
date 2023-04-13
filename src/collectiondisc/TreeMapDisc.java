package collectiondisc;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDisc {
	
	public static void main(String[] args) {
TreeMap<String, String> hm = new TreeMap<String, String>();
		
		hm.put("Rupee", "India");
		
		hm.put("Dollar", "USA");
		hm.put("Pound", "UK");
		hm.put("Bhat", "Thailand");
		
		System.out.println(hm);
	}

}
