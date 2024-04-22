// Task 4Create a CustomStack class with operations Push, Pop, Peek, and IsEmpty. 
//Demonstrate its LIFO behavior by pushing integers onto
//the stack, then popping and displaying them until the stack is empty.

package Day5;
import java.util.*;

public class CustomStack {
	
	private int[] stackArray;
    private int top;
    private int capacity;

    
    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1; // 
    }
    
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element onto full stack");
            return;
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }
    
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 CustomStack stack = new CustomStack(5);

	        // Pushing integers onto the stack
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);
	        stack.push(5);
	        
	        System.out.println("Popping elements from the stack:");
	        while (!stack.isEmpty()) {
	            System.out.print(stack.pop() + " ");
	        }

	}

}
