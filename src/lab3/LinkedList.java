package lab3;

public class LinkedList {
	private ListElement front;			//front node of the list
	private ListElement current;		//current node for traversing the list
	private ListElement end;			//end node of the list
	private int numElements;			//number of elements in the list
	
	//constructor
	public LinkedList() {
		this.front = null;
		this.current = null;
		this.end = null;
		this.numElements = 0;
	}
	
	//add a new element to the end of the list
	public void addElement(ListElement le) {
		//if the front equals null, the list if empty, insert element to the front
		if(front == null) {
			front = end = le;
			return;
		}
		//otherwise, add the element to the end of the list
		end.setNext(le);
		le.setPrevious(end);
		end = le;
		numElements++;					//increment number of elements
	}
	
	//retrieve an element from an index
	public ListElement getElement(int index) {
		//if the index is negative, the element does not exist
		if (index < 0)
			return null;
		//if the list is not empty
		if (front != null) {
			current = front;
			//for the length of index, traverse the list until reaching the element at the index
			for(int i = 0; i < index; i++) {
				//if there is no next element, the element does not exist
				if(current.getNext() == null)
					return null;
				current = current.getNext();
			}
		}
		return current;
	}
	
	//delete an element from the list from an index
	public ListElement deleteElement(int index) {
		ListElement temp1 = new ListElement();	//temp element for previous
		ListElement temp2 = new ListElement();	//temp element for next
		current = getElement(index);			//find the element at index
		//if current was not set to an element, it does not exist
		if (current == null) {
			System.out.println("Element does not exist.");
			return null;
		}
		//if current was set as equal to front element, set previous node to null
		if (current == front) {
			front = current.getNext();
			front.setPrevious(null);
		}
		//else, if current was set as equal to end element, set nect node to null
		else if (current == end) {
			end = current.getPrevious();
			end.setNext(null);
		}
		//else, the element is in the middle of the list, change the pointers to pull it out of the list
		else {
			temp1 = current.getPrevious();
			temp2 = current.getNext();
			temp1.setNext(temp2);
			temp2.setPrevious(temp1);
		}
		numElements--;							//decrement number of elements in the list
		return current;
	}
	
	//print the list from the tail first
	public void printLinkedListTail() {
		//ensure list is not empty
		if (end != null) {
			current = end;
			//while current equals an element, traverse from the rear and print list
			while (current != null) {
				System.out.println(current.getData());
				current = current.getPrevious();
			}
		}
	}
	
	//print the list from the head first
	public void printLinkedListHead() {
		//ensure list is not empty
		if (front != null) {
			current = front;
			//while current equals an element, traverse from the front and print list
			while (current != null) {
				System.out.println(current.getData());
				current = current.getNext();
			}
		}
	}
}