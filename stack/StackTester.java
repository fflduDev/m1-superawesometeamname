package stack;

public class StackTester {

	Stack s;

	// Test method for debugging
	public static void main(String[] args) {

		Stack stack = new StackImpl();

		stack.push("Cheese");

		//initial empty/full tests on null stack
		System.out.println("Testing if empty: " + stack.isEmpty());
		System.out.println("Testing if full: " + stack.isFull());

		//setting capacity and empty/full tests on non-null stack
	 	stack.setCapacity(4);

	 	System.out.println("Testing if empty: " + stack.isEmpty());
	 	System.out.println("Testing if full: " + stack.isFull());

	 	//adding values
	 	stack.push("one");
	 	stack.push("two");
	 	stack.push("cheese");
	 	stack.push("a");

	 	//testing display and full
	 	System.out.println("Testing if full: " + stack.isFull());
	 	stack.display();

	 	//testing handling of overflow
	 	stack.push("b");

	 	//pop testing
	 	String value = stack.pop();
	 	System.out.println(value);
	 	System.out.println(stack.pop());
	 	stack.push("cool");
	 	System.out.println(stack.pop());
	 	stack.push("cool");

	 	//final empty/full tests
	 	System.out.println("Testing if empty: " + stack.isEmpty());
	 	System.out.println("Testing if full: " + stack.isFull());

	 	//final display test to make sure it stops at proper value (should be "cool")
	 	stack.display();

	}

	public void runTests() {

		initStack();

		System.out.println();

		testPeek(s);

		System.out.println();

		testPop(s);
		
		System.out.println();

		testPeek(s);

		System.out.println();

		s.push("Gnarly");
		s.push("Harley");

		testPeek(s);

		System.out.println();

		testClearStack(s);
		

	}

	public void initStack() {

		s = new StackImpl();

		s.setCapacity(10);

		s.push("Kevin");
		s.push("Buzz");
		s.push("Megan");
		s.push("Linnie");
		s.push("Jeff");
		s.push("Fuller");

		s.display();

	}

	public void testPeek(Stack s) {

		System.out.println("Peeking into stack: " + s.peek());

	}

	public void testPop(Stack s) {

		System.out.println("Popping value from stack: " + s.pop() +
		"\nContents of list:");
		s.display();

	}

	public void testClearStack(Stack s) {

		System.out.println("Emptying stack...");
		while (!s.isEmpty()) s.pop();
		System.out.println("Is stack empty? " + s.isEmpty());

	}

}
