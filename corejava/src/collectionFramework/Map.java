package collectionFramework;

import java.util.HashMap;

public class Map {
public static void main(String[] args) {
	System.out.println("IPL 2024\n RCb vs RR");
	HashMap m = new HashMap();
	m.put("Raj Jat", 101);
	m.put("Rahul Jat", 99);
	m.put("Pankaj Jat", 0);
	m.put("Moyan Dhawan", 81);
	m.put("Devald Brevis", 41);
	m.put("Liam Livingstone", 27);
	m.put("Extras", 11);
	m.put("Total", 360);
	System.out.println(m.entrySet());
	System.out.println(m.size());
	System.out.println("RCB won by 111 Runs");
	
}
}
