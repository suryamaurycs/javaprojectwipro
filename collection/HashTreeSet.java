package collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Display Data using TreeMap");
		//TReeSet - Sort s the elements
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("a",100);
		tm.put("b",200);
		tm.put("c",300);
		tm.put("d",400);
		
		Set<Map.Entry<String, Integer>> st1 = tm.entrySet();
		for(Map.Entry<String, Integer> me:st1) {
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}

	}

}
