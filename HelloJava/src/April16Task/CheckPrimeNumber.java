//Task 3: Control Flow Write a Java program that reads an integer and prints whether 
//it is a prime number using a for loop and if statements.

package April16Task;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for check prime or not:");
		int num = sc.nextInt();
		
		boolean isprime = true;
		if(num <=1) {
			isprime = false;
		}
		else {
			for(int i = 2;i<=num/2;i++) {
				if(num % i == 0) {
					isprime = false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println(num + " is a Prime Number");
		}
		else {
			System.out.println(num + " is not a Prime Number");

		}

	}

}
