package linkedList;

public class LinkedListImpl implements LinkedList {

	private ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		if (head == null) { //if list empty -> false
			return false;
		}
		ListItem cur = head;
		while (cur != null) { //iterates through list until it finds item
			if (cur.data == thisItem) {
				return true;
			} else {
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
		int i = 0; ListItem cur = head;
		while (cur != null) {
			i += 1;
			cur = cur.next;
		}
		return i;
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
		while (cur.next != null) { //checks all items from head to end
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

		if (head == null) return false;			// can't insert before smth that doesn't exist

		if (head.data.equals(itemToInsertBefore)) {		// head case (haha)
			head.next = new ListItem(newItem) {{
				this.next = head.next;
			}};
			return true;
		}

		ListItem cur = head.next; ListItem prev = head;	// track prev node in order to place new node in correct spot
		while (cur != null) {
			if (cur.data.equals(itemToInsertBefore)) {
				prev.next = new ListItem(newItem);
				prev.next.next = cur;
				return true;
			}
			prev = cur;
			cur = cur.next;
		}

		return false;

	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		ListItem cur = head;
		ListItem add = new ListItem(newItem);
		
		if (head == null) { //if list is empty
			head = add;
			return true;
		}
		
		while (cur.next != null) {
			if (cur.data.equals(itemToInsertAfter)) {
				add.next = cur.next;
				cur.next = add;
				return true;
			}
			cur = cur.next;
		}
		return false;
	}

	@Override
	public void sort() {

		// possibly the worst sorting algorithm known to man
		// O(n2), iterates node by node thru list, getting smallest nodes to front of list

		if (head == null || head.next == null) return;	// empty/1-item lists are already sorted

		ListItem smallestPrev;	// node whose next has smallest data
		ListItem prev;			// node before node used for comparison
		ListItem outerCur;		// position to move smallest node to

		// makes a dummy head so the whole list can be sorted the same way, then removes head at the end
		head = new ListItem(null) {{
			this.next = head;
		}};

		outerCur = head;
	
		while (outerCur.next != null) {
			prev = outerCur;
			smallestPrev = prev;
			while (prev.next != null) {
				if (prev.next.data.compareToIgnoreCase(smallestPrev.next.data) <= 0) {
					smallestPrev = prev;
				}
				prev = prev.next;
			}
			prev = smallestPrev.next;	// really smallest shouldn't be assigned to current but I needed a temp node soooo
			smallestPrev.next = smallestPrev.next.next;
			prev.next = outerCur.next;
			outerCur.next = prev;
			outerCur = prev;
		}

		head = head.next;	// bye bye

	}
	
}