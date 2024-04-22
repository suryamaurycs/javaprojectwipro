package April17Task;

import java.util.Scanner;

public class RecursiveFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the nth Element :");
		n = sc.nextInt();
		
		int[] fiboarr = new int[n];
		
		for(int i =0;i<n;i++) {
			fiboarr[i] = fibonacci(i);
		}
		
		System.out.println("Fibonacci Series ");
		for(int i =0;i<n;i++) {
			System.out.print(fiboarr[i]+" ");
		}
		
		int nelem = fibonacci(n-1);
		System.out.println();
		System.out.println("The "+ n + " element number is " + nelem);
	}
	
	public static int fibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
