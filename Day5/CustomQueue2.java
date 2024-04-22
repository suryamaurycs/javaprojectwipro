//Task 5 2) Develop a CustomQueue class with methods for Enqueue, Dequeue, Peek, 
//and IsEmpty. Show how your queue can handle different data types by 
//enqueuing strings and integers, then dequeuing and displaying them to 
//confirm FIFO order.

package Day5;
import java.util.*;

public class CustomQueue2<T> {
	private LinkedList<T> queue;
	
    public CustomQueue2() {
        this.queue = new LinkedList<>();
    }
    
    public void enqueue(T element) {
        queue.add(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomQueue2<Integer> intQueue = new CustomQueue2<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);
        intQueue.enqueue(4);
        intQueue.enqueue(5);

        System.out.println("Dequeuing integers from the queue:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        CustomQueue2<String> stringQueue = new CustomQueue2<>();
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Orange");
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Grapes");
        stringQueue.enqueue("Pineapple");

        System.out.println("Dequeuing strings from the queue:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
    }

	}


