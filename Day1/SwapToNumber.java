//Task 1: Data Types/VariablesWrite a program that declares two integer variables,
//swaps their values without using a third variable, and prints the result.
package Day1;
import java.util.Scanner;

public class SwapToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter the First Number :");
		num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		num2 = sc.nextInt();
		
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		
		System.out.println("After Swap The First Number is "+num1);
		System.out.println("After Swap The Second Number is "+num2);

	}

}
