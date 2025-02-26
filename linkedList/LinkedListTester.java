package linkedList;

public class LinkedListTester {

	LinkedList ll;

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
