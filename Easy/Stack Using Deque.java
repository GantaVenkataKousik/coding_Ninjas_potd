import java.util.* ;
import java.io.*; 
public class Stack {
	// Initialize your data structure.
	Deque<Integer> dq;
	Stack() {
		dq = new LinkedList<>();
	}

	// Pushes 'X' into the stack. Returns true if it gets pushed into the stack, and false otherwise.
	public boolean push(int x) {
		
		dq.addLast(x);
		return true;
		
	}

	// Pops top element from Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
	public int pop() {
		if(isEmpty())return  -1;
		return dq.pollLast();
	}

	// Returns the topmost element of the stack. In case the stack is empty, it returns -1.
	public int top() {
		if(isEmpty())return -1;
		return dq.peekLast();
	}

	// Returns true if the stack is empty, otherwise false.
	public boolean isEmpty() {
		return (dq.size()==0);
	}

	// Returns the number of elements currently present in the stack.
	public int size() {
		return dq.size();
	}
}
