package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection02{
	
		public static void main(String[]args) {
			
			Person p1 = new Person(1,"Raj");
			Person p2 = new Person(2,"Sachin");	 						
			Person p3 = new Person(3,"Rahul");	
			Person p4 = new Person(4,"Pankaj");	 	
			
			ArrayList list = new ArrayList();
			
			list.add("one");
			list.add(100);
			list.add("Three");
			list.add("ten");
			list.add(200);
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			
		//	for(object object:list) {
			//	System.out.println(object);
			//}
			
			Iterator it = list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			

			

		
	}

}
