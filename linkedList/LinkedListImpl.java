package linkedList;

public class LinkedListImpl implements LinkedList {

	private ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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