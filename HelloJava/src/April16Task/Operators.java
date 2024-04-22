//Operators
//Create a program that simulates a simple calculator using command-line arguments to 
//perform and print the result of addition, subtraction, multiplication, and division..

package April16Task;
import java.util.*;
public class Operators {
	
	public static int sum(int num1,int num2)
	  	{
			int sum=num1+num2;
			return sum;
		}
	public static int sub(int num1,int num2)
	 {
			int sub=num1-num2;
			return Math.abs(sub);		
	 }
	
	public static int mul(int num1,int num2)
		{
		int mult=num1*num2;
		return mult;	
		}
	public static float div(int num1,int num2)
		{
		float div=num1/num2;
		return div;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.valueOf(args[0]);
		int num2=Integer.valueOf(args[1]);
		int sum= sum(num1,num2);
		  System.out.println(sum);
		int sub=sub(num1,num2);
		  System.out.println(sub);
		int mult=mul(num1,num2);
		  System.out.println(mult);
		float div = div(num1,num2);
		  System.out.println(div);
		
	}

}
