package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl();
		stackTester.push("thing in stack");
		runTests(stackTester);

	}
	
	public static void runTests(Stack stack) {
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

}
