package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ContestantStream {
public static void main(String[] args) {
			
	ArrayList<Contestant> list = new ArrayList<Contestant>();
	list.add(new Contestant ("Rahul","9770231935"));
	list.add(new Contestant ("Raj","9770231976"));
	list.add(new Contestant ("Rupali","9867804787"));
	list.add(new Contestant ("Apurva","9874679865"));
	list.add(new Contestant ("Pankaj","9630750070"));
	list.add(new Contestant ("Invalid Name","977023"));
	
	
		System.out.println("winner....!!!!");
		
		
		list.stream().map(e-> e.phone).filter(e->e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(),e ->{
		Collections.shuffle(e);
		return e.stream();
		})).limit(3).forEach(e-> System.out.println(e));
}
		
	
	 
	
		
}

class Contestant{
	public String phone = null;
	public String name = null;

	public Contestant(String n, String p) {

		name = n;

		phone=p;

	}
	
}
