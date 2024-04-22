package Day6;
import java.util.*;
public class ListInterface {

	 public static void removeEverySecondElement(List<?> list) {
	        for (int i = 1; i < list.size(); i += 2) {
	            list.remove(i);
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> nums = new ArrayList<>();
	        nums.add(11);
	        nums.add(2);
	        nums.add(33);
	        nums.add(42);
	        nums.add(15);
	        nums.add(61);
	        

	        System.out.println("Original List: " + nums);
	        removeEverySecondElement(nums);

	        System.out.println("List after removing every second element: " + nums);
	}

}
