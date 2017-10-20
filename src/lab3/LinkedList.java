public class LinkedList {
	private ListElement front;
	private ListElement current;
	private ListElement end;
	private int numElements;
	
	public LinkedList() {
		this.front = null;
		this.current = null;
		this.end = null;
		this.numElements = 0;
	}
	
	public void addElement(ListElement le) {
		if(front == null) {
			front  = le;
			current = front;
			return;
		}
		le.setNext(current);	
		current = le;
	}
	
	public ListElement getElement(int index) {
		// index must be 1 or higher
		if (index < 0)
			return null;
		current = null;
		if (front != null) {
			current = front.getNext();
			for(int i = 0; i < index; i++) {
				if(current.getNext(); == null) {
					System.out.println("Element does not exist.");
					return null;
				}
				current = current.getNext();
			}
		}
		return current;
	}
	
	public ListElement deleteElement(int index) {
		
	}
	
	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		
	}
}