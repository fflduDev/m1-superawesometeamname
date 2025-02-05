package linkedList;

public class LinkedListImpl implements LinkedList {

	private ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		if (head == null) { //if list empty -> false
			return false;
		}
		ListItem cur = head;
		while (cur.next != null) { //iterates through list until it finds item
			if (cur.data == thisItem) {
				return true;
			}else {
				cur = cur.next;
			}
		}
		return false; //if loop does not find the item
	}

	@Override
	public Boolean addItem(String thisItem) {
		if (head == null) {
			head = new ListItem(thisItem);
			return true;
		}
		ListItem cur = head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = new ListItem(thisItem);
		return true;
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listItems() {
		if (head == null) {
			return;
		}
		ListItem cur = head;
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		if (head == null) { //if head is empty
			return false;
		}
		
		if (head.data.equals(thisItem)) { //if head is the item to remove
			head = head.next;
			return true;
		}
		
		ListItem cur = head;
		while (cur != null) { //checks all items from head to end
			if (cur.next.data.equals(thisItem)) {
				cur.next = cur.next.next;
				return true;
			}
			cur = cur.next;
		}
		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		if (head == null) return;
		ListItem cur = head;
		while (cur.next != null) {
			if (head.data.compareTo(cur.data) > 0) head = cur;
		}


	}
	
}

// a, b, c, d