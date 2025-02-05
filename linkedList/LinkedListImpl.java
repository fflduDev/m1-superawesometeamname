package linkedList;

public class LinkedListImpl implements LinkedList {

	private ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		if (head == null) {
			return false;
		}
		ListItem cur = head;
		while (cur.next != null) {
			if (cur.data == thisItem) {
				return true;
			}else {
				cur = cur.next;
			}
		}
		return false;
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
		
		// System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
	
		// return null;
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listItems() {
		// TODO Auto-generated method stub
		
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
		
	}
	
}

// a, b, c, d