package collection;
import java.util.*;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		// HashMap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("b", 600);
		hm.put("c", 300);
		hm.put("e", 400);
		
		
		Set<Map.Entry<String,Integer>> st = hm.entrySet();  //return Set View
		for(Map.Entry<String, Integer> me:st) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}
	
	
	
	
	

}
