 package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {

		Collection list = new ArrayList();
		list.add("Iron man");
		list.add("Bat man");
		list.add("captain america");
		list.add("Shakti man");
		list.add("Raj");
		list.add("Rahul");
		list.add("Pankaj");
		list.add(1);
		list.add(12);
		
		//System.out.println(List);
		
		Collection Bhai = new ArrayList();
		Bhai.add("Rahul");
		Bhai.add("Pankaj");
		Bhai.add("Raj");
		
		Collection villain = new ArrayList();
		villain.add("thanos");
		villain.add("Ravan");
		
		Collection AntiHero = new ArrayList();
		AntiHero.add("Shree Ram");
		
		list.addAll(villain);
		list.addAll(Bhai);
		list.addAll(AntiHero);
		list.addAll(list);
		System.out.println(villain);
		System.out.println(Bhai);
		System.out.println(AntiHero);
		System.out.println(list);
		

				

	}

}
