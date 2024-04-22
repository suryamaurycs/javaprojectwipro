//Task 3: Packages/Classpath
//Create a package com.math.operations and include classes for various arithmetic 
//operations. Demonstrate how to compile and run these using the classpath.

package Day4.com.math.operations;
import java.util.*;

public class ArithmetricOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.print("Enter your choice : \n"+
						"1. Addition  \n"+
				        "2. Subtration \n" +
						"3. Multiplication  \n" +
				        "4. Division  \n");
		int x = sc.nextInt();
		if(x == 1) {
			Addition add= new Addition(a,b);
			System.out.println(add.operation());
			}
		else if (x == 2) {
		Subtraction sub = new Subtraction(a,b);
		System.out.println(sub.operation());
		}
		else if(x == 4) {
			Division div = new Division(a,b); 
			System.out.println(div.operation());
		}
		else if(x==3) {
			Multiply mul = new Multiply(a,b);
			System.out.println(mul.operation());
	 }
	 else {
		System.out.println("wrong Choice ");
	 }
	}
}


