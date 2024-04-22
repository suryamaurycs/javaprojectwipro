package April19;
import java.util.*;

//Task )- Create a ArrayList of Employee and increment the salary of all the employee by 10%


public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final double AverageSalary = 98253d;

		// Create an ArrayList of Employee
		ArrayList<Employee> employee = new ArrayList<>();
		
		//Array 
		//Employee[] empObjects = new Employee[4];  // array declaration
		//create & initialize actual employee objects using consts
		employee.add(new Employee("Shivam",2342f));
		employee.add(new Employee("shubham",4636f));
		employee.add(new Employee("vikash",3536f));
		employee.add(new Employee("Surya",3678f));
		
		for(Employee emp : employee) {
			emp.setSalary(emp.getSalary()*1.1);
		}
		
		 for (Employee emp : employee) {
	            System.out.println(emp);
	        }
		
		System.out.println(employee.get(2));
		
	}

}
