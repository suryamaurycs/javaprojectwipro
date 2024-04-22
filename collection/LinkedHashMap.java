package collection;

import java.util.Map;
import java.util.Set;
import java.util.*;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHasMap
		
		System.out.println(" Display Data usign LinkedHashMap - Maintains intsertion order with Linked List");
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();
		lm.put("a",100);
		lm.put("b",200);
		lm.put("c",300);
		lm.put("d",400);
		
		
		Set<Map.Entry<String, Integer>> s = tm.entrySet();
		for(Map.Entry<String, Integer> me: s) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
	}

}
