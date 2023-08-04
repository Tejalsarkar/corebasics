package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		 List list = new ArrayList();
			list.add(new Employee(6,"khushali",800));
			list.add(new Employee(4,"Rahul",300));
			list.add(new Employee(3,"khushali",700));
			list.add(new Employee(2,"Shree Ram",500));
			list.add(new Employee(7,"Raj",900));
			list.add(new Employee(3,"Sachin",450));
		//	Collections.sort(list);
			//Collections.sort(list, new orderByName());
			Collections.sort(list, new OrderById());
			//Collections.sort(list, new orderBySalary());

	      //-----------FIRST METHOD -------//
			Iterator it =list.iterator() ;
			while(it.hasNext()) {
				Object Object = (Object) it.next();
				System.out.println(Object);
	}
			//---------SECOND METHOD-------//
			
	/*for(Object object:list){
		System.out.println(object);
	} */
		
		
	
		
	}
}
