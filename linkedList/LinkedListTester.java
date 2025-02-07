package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
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

		tester.insertAfter("cheese", "blah blah blah");
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
		t5.addItem("eeeee");
		t5.addItem("ddddd");
		t5.addItem("ccccc");
		t5.addItem("bbbbb");
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

}
