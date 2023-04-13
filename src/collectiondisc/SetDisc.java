package collectiondisc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDisc {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(50);
		hs.add(40);
		hs.add(32);
		hs.add(100);
		hs.add(32);
		System.out.println(hs);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(50);
		lhs.add(40);
		lhs.add(32);
		lhs.add(100);
		lhs.add(32);
		
		System.out.println(lhs);
		
		
		Integer [] a = {5, 6, 8, 9, 45};
		
		HashSet<Integer> hs1 = new HashSet<Integer>(Arrays.asList(a));
		
		System.out.println(hs1);
		
		
		TreeSet<String> ts = new TreeSet<String>();
		
		
		ts.add("Ronny");
		ts.add("Daniel");
		ts.add("Edward");
		ts.add("Niel");
		
		System.out.println(ts);
		
		
		
		
	}

}
