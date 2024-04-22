//You are tasked with creating a grade calculator program. The program should take a student's score as input and output their corresponding grade based on the following criteria:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: Below 60
//Ensure that if the input score is not within the range of 0 to 100, the program outputs an error message.

package Arpil15Task;
import java.util.*;

public class GradeCal {
	
	public static char calGrade(int score) {
		char grade;
		if(score >=90 && score <=100)
			grade = 'A';
		else if(score >=80 && score <=89)
			grade = 'B';
		else if(score >=70 && score <=79)
			grade = 'C';
		else if(score >=60 && score <=69)
			grade = 'D';
		else 
			grade = 'F';
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Score of Student ");
			int score = sc.nextInt();
			if(score >=0 && score <=100) {
				char grade = calGrade(score);
				System.out.println("Student grade is "+grade);
			}
			
	}

}
