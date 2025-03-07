package stack; 

public class StackImpl implements Stack {

	private String[] stack; //array for stack values
	int last = -1; //tracks index of the most recent value
	
	@Override
	public void push(String s) {
		if (stack == null) { //checks if the stack array has been initialized
			System.out.println("Please set the size of the stack (setCapacity) before pushing");
			return;
		}
		
		if (last + 1 == stack.length) {
			System.out.println("Stack is full, cannot add item [" + s + "]");
			return;
		}
		
		stack[last + 1] = s;
		last ++;
		System.out.println("Added to stack: " + s);
	
	}

	@Override
	public String pop() {
		if (stack == null) { //checks if the stack array has been initialized
			System.out.println("Please set the size of the stack (setCapacity) before poping");
			return null;
		}
		
		String value = stack[last]; //fetch last value in stack
		last--; //set index of new last to previous index
		return value;
		
	}

	// isEmpty returns true if no item in top of stack, or if stack isn't initialized
	@Override
	public Boolean isEmpty() {
		if (stack == null || last == -1) {
			return true;
		} else {
			return false;
		}
	}

	//isFull returns true if top item is at the highest index possible, false otherwise
	@Override
	public Boolean isFull() {
		if (stack != null && last + 1 == stack.length) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return last + 1;
	}

	@Override
	public String peek() {
		if (stack == null) { //checks if the stack array has been initialized
			System.out.println("Please set the size of the stack (setCapacity) before peeking");
			return null;
		}
		return stack[last];
	}

	@Override
	public void setCapacity(int size) {
		
		stack = new String[size];
		
	}

	@Override
	public void display() {
		if (stack == null) { //checks if the stack array has been initialized
			System.out.println("Please set the size of the stack (setCapacity) before displaying");
			return;
		}
		
		System.out.println("Displaying current stack values: ");
		for (int i = last; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
 

}
