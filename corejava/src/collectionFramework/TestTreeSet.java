 package collectionFramework;

import java.util.SortedSet;
import java.util.TreeSet;


public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("z");
		set.add("x");
		set.add("y");
		set.add("m");
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		set.add("q");
		
		 for(Object object:set);
		 System.out.println(set.first());
		 System.out.println(set.last());
		 System.out.println(set.headSet("c"));
		 System.out.println(set.tailSet("b"));
		 System.out.println(set.subSet("d", "y"));
		 System.out.println();
		 
		 
		 
		 
		 
		
			
		
	}

}
