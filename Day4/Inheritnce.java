//Task 2: Inheritance 	Create a Shape class with a method area() and extend it with
//Circle and Rectangle classes overriding the area() method appropriately.
package Day4;

public class Inheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());

	}

}
