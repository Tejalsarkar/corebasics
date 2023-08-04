package collectionFramework;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestPersonHascodeEqual {
	public static void main(String[] args) {
		
		Person p1 = new  Person (1,"Dubai");
		Person p2 = new  Person (1,"Dubai");
		
		System.out.println(p1.equals(p2));
		
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
