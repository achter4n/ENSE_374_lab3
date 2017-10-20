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
		le.setNext(end);	
		end = le;
		numElements++;
	}
	
	public ListElement getElement(int index) {
		if (index < 0)
			return null;
		current = null;
		if (front != null) {
			current = front.getNext();
			for(int i = 0; i < index; i++) {
				if(current.getNext() == null)
					return null;
				current = current.getNext();
			}
		}
		return current;
	}
	
	public ListElement deleteElement(int index) {
		current = getElement(index);
		if (current == null) {
			System.out.println("Element does not exist.");
			return null;
		}
		current.setNext(current.getNext().getNext());
		numElements--;
		return current;
	}
	
	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		
	}
}