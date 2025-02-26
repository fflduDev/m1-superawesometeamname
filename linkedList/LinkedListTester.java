package linkedList;

public class LinkedListTester {

	LinkedList ll;

	// Test method for debugging
	public static void main(String[] args) {

		LinkedList tester = new LinkedListImpl();

		tester.addItem("an item to add");
		tester.addItem("zzzzzzzz than others");
		tester.addItem("this is because I am stupid");
		tester.addItem("less than others");
		tester.addItem("blah blah blah");
		tester.addItem("greater than others");
		tester.addItem("this is going to give me a hernia");
		tester.addItem("a");
		tester.listItems();

		tester.insertBefore("cheese", "blah blah blah");
		tester.listItems();
		

		System.out.println("-------------");

		tester.sort();
		tester.listItems();

		// Empty list
		LinkedList t1 = new LinkedListImpl();
		t1.listItems();
		System.out.println("-------------");
		t1.sort();
		t1.listItems();
		System.out.println("=============");

		// One item
		LinkedList t2 = new LinkedListImpl();
		t2.addItem("aaaaa");
		t2.listItems();
		System.out.println("-------------");
		t2.sort();
		t2.listItems();
		System.out.println("=============");

		// Two items
		LinkedList t3 = new LinkedListImpl();
		t3.addItem("bbbbb");
		t3.addItem("aaaaa");
		t3.listItems();
		System.out.println("-------------");
		t3.sort();
		t3.listItems();
		System.out.println("=============");

		// Three items
		LinkedList t4 = new LinkedListImpl();
		t4.addItem("ccccc");
		t4.addItem("bbbbb");
		t4.addItem("aaaaa");
		t4.listItems();
		System.out.println("-------------");
		t4.sort();
		t4.listItems();
		System.out.println("=============");

		// Five items
		LinkedList t5 = new LinkedListImpl();
		t5.addItem("bbbbb");
		t5.addItem("eeeee");
		t5.addItem("ddddd");
		t5.addItem("ccccc");
		t5.addItem("aaaaa");
		t5.listItems();
		System.out.println("-------------");
		t5.sort();
		t5.listItems();
		System.out.println("=============");
		System.out.println(t5.isItemInList("eeeee"));
		System.out.println(t5.itemCount());
		System.out.println(t5.deleteItem("ccccc"));
		System.out.println(t5.deleteItem("ccccc"));

		t5.listItems();

	}

	public void runTests() {

		initLinkedList();

		System.out.println();

		testFindItem();

		System.out.println();

		testDeleteItem();

		System.out.println();

		testInsert();

	}

	public void initLinkedList() {

		ll = new LinkedListImpl();

		System.out.println("Initializing values for linked list:");

		ll.addItem("Bannow");
		ll.addItem("Egan");
		ll.addItem("Kosovo");
		ll.addItem("Kokomo");

		ll.listItems();

	}

	public void testFindItem() {

		System.out.println("Is Egan in list? " + 
			ll.isItemInList("Egan"));
		System.out.println("Is Albania in list? " +
			ll.isItemInList("Albania"));

	}

	public void testDeleteItem() {

		System.out.println("Deleting Kosovo. New list content:");
		ll.deleteItem("Kosovo");
		ll.listItems();

	}

	public void testInsert() {

		System.out.println("Inserting 'Guang Zhou' before 'Egan':");
		ll.insertBefore("Guang Zhou","Egan");
		ll.listItems();

		System.out.println();

		System.out.println("Inserting 'Mozambique' after 'Guang Zhou':");
		ll.insertAfter("Mozambique", "Guang Zhou");
		ll.listItems();

	}

}
