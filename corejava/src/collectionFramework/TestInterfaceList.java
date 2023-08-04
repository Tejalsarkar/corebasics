package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestInterfaceList {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add("100");
		list.add("Raj");
		list.add("200");
		list.add("Rahul");
		list.add("Pankaj");

		// System.out.println(list);

		Collection c = new ArrayList();
		c.add("four");
		c.add("700");
		c.add("nikita");

		list.addAll(c);
		System.out.println(list);

		list.contains(100);
		System.out.println(list.contains(100));

		list.containsAll(c);
		System.out.println(c);

		list.isEmpty();
		System.out.println();

		list.removeAll(c);
		System.out.println(list);

	}

}
