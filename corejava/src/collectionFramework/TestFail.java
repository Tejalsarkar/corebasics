package collectionFramework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestFail {

	public static void main(String[] args) {

		Vector list = new Vector();

		list.add("one");
		list.add("Money");
		list.add(500);
		list.add("Dollor");
		list.add(700);
		list.add("five");
/*
		Iterator it = list.iterator();
		list.add(200);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		 Enumeration e = list.elements();
		 
		  list.add(200);
		 
		 while(e.hasMoreElements()) { System.out.println(e.nextElement()); }
		 
	}

}
