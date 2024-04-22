//Task 4 : Write a program that attempts to divide by zero, catches the 
//ArithmeticException, and provides a custom error message.
package Day4.com.math.operations;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int num1 = 3;
            int num2 = 0;
            int res = num1 / num2;
            System.out.println("Result of division: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Attempted to divide by zero");
        }

	}

}
