package lab3;

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
			front = end = le;
			return;
		}
		end.setNext(le);
		le.setPrevious(end);
		end = le;
		numElements++;
	}
	
	public ListElement getElement(int index) {
		if (index < 0)
			return null;
		if (front != null) {
			current = front;
			for(int i = 0; i < index; i++) {
				if(current.getNext() == null)
					return null;
				current = current.getNext();
			}
		}
		return current;
	}
	
	public ListElement deleteElement(int index) {
		ListElement temp1 = new ListElement();
		ListElement temp2 = new ListElement();
		current = getElement(index);
		if (current == null) {
			System.out.println("Element does not exist.");
			return null;
		}
		if (current == front) {
			front = current.getNext();
			front.setPrevious(null);
		}
		else if (current == end) {
			end = current.getPrevious();
			end.setNext(null);
		}
		else {
			temp1 = current.getPrevious();
			temp2 = current.getNext();
			temp1.setNext(temp2);
			temp2.setPrevious(temp1);
		}
		numElements--;
		return current;
	}
	
	public void printLinkedListTail() {

	}
	
	public void printLinkedListHead() {
		if (front != null) {
			current = front;
			while (current != null) {
				System.out.println(current.getData());
				current = current.getNext();
			}
		}
	}
}