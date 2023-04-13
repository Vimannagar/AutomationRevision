package collectiondisc;

import java.util.ArrayList;

public class ListClasses {

	
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc");
		
//		al.add(5);
//		
//		al.add('c');
//		
//		al.add('c');
		
		System.out.println(al);
		
		al.remove(0);
		
		al.set(5, "India");
		
		ArrayList<String> al1 = new ArrayList<String>(al);
		
		al1.addAll(al);
		
		
		al1.removeAll(al);
		
		
		al1.retainAll(al);
		
		
		
		
		
		
		
		
	}
}
