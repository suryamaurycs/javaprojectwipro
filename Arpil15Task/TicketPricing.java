//You are designing a ticket pricing program for a movie theater. The program should prompt the user for their age and the type of movie they want to watch (e.g., "regular" or "3D"). Based on the age and movie type, the program should calculate and output the ticket price according to the following rules:
//Regular Movie:
//Age < 18: $8
//Age >= 18: $12
//3D Movie:
//Age < 18: $10
//Age >= 18: $15
package Arpil15Task;

import java.util.Scanner;

public class TicketPricing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age :");
		int age = sc.nextInt();
		
		System.out.println("Enter the type of movie (regular or 3D");
		String moviType = sc.next().toLowerCase();
		
		double ticketprice = 0;
		if(moviType.equals("regular")) {
			if(age < 18) {
				ticketprice = 8.0;
			}else {
				ticketprice = 12.0;
			}
		}else if(moviType.equals("3d")) {
			if(age<18) {
				ticketprice = 10.0;
			}else {
				ticketprice = 15.0;
			}
		}
		else {
			System.out.println("Please enter correct movie type");
		}
			System.out.println("Ticket price : $"+ticketprice);
	}

}
