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
		
	}
	
	public ListElement deleteElement(int index) {
		
	}
	
	public void printLinkedListTail() {
		
	}
	
	public void printLinkedListHead() {
		
	}
}