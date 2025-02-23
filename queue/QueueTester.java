package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue testQueue = new QueueImpl(5);
		runTests(testQueue);
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

}
