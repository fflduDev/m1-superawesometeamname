package queue;

public class QueueTester {

	Queue q;

	// Test method for debugging
	public static void main(String[] args) {

		Queue queue = new QueueImpl(5);

		System.out.println(queue.isFull());
		System.out.println(queue.isEmpty());
	
		queue.enQueue("Carl");
		queue.enQueue("Joe");
		queue.enQueue("Steve");
		queue.enQueue("Mario");
		queue.enQueue("Luigi");
		queue.display();

		System.out.println(queue.isFull());

		System.out.println(queue.deQueue());	
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

		queue.enQueue("Cheese");
	
		queue.display();

	}
	
	public static void runTests(Queue q) {
		System.out.println(q.isFull());
		System.out.println(q.isEmpty());
		q.enQueue("Carl");
		q.enQueue("Joe");
		q.enQueue("Steve");
		q.enQueue("Mario");
		q.enQueue("Luigi");
		q.display();
		System.out.println(q.isFull());
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
		q.enQueue("Cheese");
		q.display();
	}

	public void runTests() {

		initQueue();

		System.out.println();

		testPeek();
		
		System.out.println();
		
		testDequeue();

		System.out.println("\nQueueing 2 new strings...");
		
		q.enQueue("Gary");
		q.enQueue("Harry");

		testPeek();

		System.out.println("\nDequeued string: " +
			q.deQueue());

		System.out.println("\nDisplaying content of queue:");
		q.display();

	}

	public void initQueue() {

		q = new QueueImpl(8);

		System.out.println("Initializing values for queue:");
		q.enQueue("Terry");
		q.enQueue("Linus");
		q.enQueue("Brendan");
		q.enQueue("Dennis");
		q.enQueue("You");
		q.enQueue("Me");

		q.display();

	}

	public void testPeek() {

		System.out.println("Peeking into queue: " + q.peek());

	}

	public void testDequeue() {

		System.out.println("Content of list after dequeue:");
		q.deQueue();
		q.display();

	}

}
