package stack;

public class StackTester {

	Stack s;

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
