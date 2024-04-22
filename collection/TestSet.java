package collection;
import java.util.*;
public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNumber = Arrays.asList(3,9,1,4,7,2,5,3,8,9,1,3,8,6);
		System.out.println(listNumber);
		
		Set<Integer> uniqueNumber = new HashSet<>(listNumber);
		
		//Set <Integer> s = new HastSet<>();
		System.out.println(uniqueNumber);
		
		//Add an element
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		
		if(names.add("Peter")) {
			System.out.println("Peter is added to the Set");
		}
		
		if(!names.add("Tom")) {
			System.out.println("Tom is already added to the set");
		}
		
		//Traverse all elements
		
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		//Search an element 
		if(names.contains("Mary")) {
			System.out.println("Found Mary");
		}
		
	}

}
