package queue;

public class QueueImpl implements Queue {

	private String[] queue;
	int front = 0; //tracks index of oldest insertion
	int rear = -1; //index of value after final value
	
	//added this constructor to initialize queue size
	public QueueImpl(int i) {
		queue = new String[i];
	}
	
	@Override
	public boolean isFull() {
		if (front == 0 && rear == queue.length - 1) {
			return true;
		} else if (front != 0 && rear == front - 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (queue[front] == null) {
			return true;
		}
		return false;
	}

	@Override
	public void enQueue(String element) { //add new elements to end of queue
		if (rear + 1 == queue.length) {
			rear = 0;
		} else {
			rear ++;
		}
		queue[rear] = element;
		
	}

	@Override
	public String deQueue() { //remove index 0, move all other values left
		// TODO Auto-generated method stub
		if (isEmpty() == true) {
			return null;
		}
		
		String output = queue[front];
		queue[front] = null;
		if (front + 1 >= queue.length) {
			front = 0;
		} else {
			front ++;
		}
		
		return output;
	}

	@Override
	public void display() {
		for (String s : queue) {
			System.out.println(s);
		}
		System.out.println("Front: " + queue[front]);
		System.out.println("Rear: " + queue[rear]);
		
	}

	@Override
	public String peek() {
		if (isEmpty() == true) {
			return null;
		}
		
		return queue[front];
	}

}
