package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("less than others");
		tester.addItem("blah blah blah");
		tester.addItem("an item to add");
		tester.listItems();
		tester.insertAfter("cheese", "blah blah blah");
		tester.listItems();
		

	}

}
