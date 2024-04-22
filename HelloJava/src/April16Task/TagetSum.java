package April16Task;
import java.util.*;


public class TagetSum {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,6,13,15,5,4};
		int target = 9;
		int flag = 0;
		
		for(int i = 0;i<nums.length;i++) {
			for(int j = i+1;j<nums.length;j++) {
				if(nums[i]+nums[j] == target) {
					System.out.println(nums[i]+ " , "+nums[j]);
					flag = 1;
				}
			}
		}
		
		if(flag == 0) {
			System.out.println("Target Sum elements are not found");
		}
		

	}

}
