package queue;

public class QueueImpl implements Queue {

	private String[] queue;
	int last = -1; //tracks index of most recent insertion
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enQueue(String element) { //add new elements to end of queue
		
		if (queue != null && last != queue.length) {
			queue[last + 1] = element;
			last ++;
		} else if (queue == null){
			System.out.println("Set capacity of queue before adding elements");
			return;
		} else {
			System.out.println("Queue full, cannot add [" + element + "]");
			return;
		}
		
	}

	@Override
	public String deQueue() { //remove index 0, move all other values left
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//added this method to initialize queue size
	public void setCapacity(int i) {
		queue = new String[i];
	}

}
