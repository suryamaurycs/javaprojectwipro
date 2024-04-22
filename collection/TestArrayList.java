package collection;
import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();   //First Mehtod // 'list can hold 10
		ArrayList<Integer> list2 = new ArrayList<Integer>(20);		//Second Method
		ArrayList<Integer> list3 = new ArrayList<Integer>(list2); // Third method
		
		/* List<Integer> l1 = new ArrayList(); // Interface
		l1.add("Hello");
		l1.add("Bye");
		l1.add(5); */
		
//		int x = 0;
//		for(int i = 0;i<3;i++)
//			x = (int) l1.get(2)+1;  //Type Casting
		
		//List<Integer> l = new List(); // Inferface
		
		
		
		
		// Add elements
		list1.add("ONE");
		list1.add("TWO");
		list1.add("THREE");
		list1.add("FOUR");
		list1.add("ONE");
		
		//list1.add(3);
		
		//find the number of elements present in an ArrayList
		System.out.println(list1.size());  //5
		list1.ensureCapacity(20);
		
		System.out.println("Traverse Element using for loop");
		for(int i =0 ;i<5;i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("Traverse element using for each loop");
		for(String num : list1) {
			System.out.println(num);
		}
		
		//Approach3:
		System.out.println(" Traverrse elemtent using iterator");
		Iterator<String> iterat = list1.iterator();
		while(iterat.hasNext()) {
			System.out.println(" The element is :"+iterat.next());
		}
		
		//Approach4 : To reverse the collectio elements
		System.out.println("Traverse element using listiterator");
		ListIterator<String> literat = list1.listIterator();
		while(literat.hasNext())
		{
			System.out.println(" The Next elemnt is :" + literat.next());
		}
		
		while(literat.hasPrevious()) {
			System.out.println(" The Previous element is :" + literat.previous());
		}
	}
	
	
	//FIND THE NUMBER OF ELEMETNS PRESENT IN AN aRRAYlIST
	System.out.println(list1.size());
	list1.ensureCapacity(20);
	
	//check empty 
	System.out.println(list1.isEmpty()); // True or False
	
	//Check Avaiablility 
	System.out.println(list1.indexOf)

}
