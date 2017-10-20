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
			for(int i = 1; i < index; i++) {
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
		ListElement temp = new ListElement();	//temp element for previous
		current = getElement(index);			//find the element at index
		//if current was not set to an element, it does not exist
		if (current == null) {
			System.out.println("Element does not exist.");
			return null;
		}
		//if current contains the front element, remove it
		if(current == front) 
			front = current.getNext();
		//otherwise, element is further in the list
		temp = current.getNext();
		current.setNext(temp.getNext());
		numElements--;							//decrement number of elements in the list
		return current;
	}
	

	public void printLinkedListTail() {

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