package lab3;

public class ListElement {
	private ListElement next;		//next node
	private ListElement previous;	//previous node
	private int data;				//node data
	
	//constructor
	public ListElement() {
		this.data = 0;
		this.next = null;
		this.previous = null;
	}
	
	/**
	 * @param data
	 * 	an integer to be stored in the node
	 * @return
	 * 	None
	 **/
	
	//setter for data
	public void setData(int data) {
		this.data = data;
	}
	
	//getter for data
	public int getData() {
		return this.data;
	}
	
	//setter for next
	public void setNext(ListElement le) {
		this.next = le;
	}
	
	//getter for next
	public ListElement getNext() {
		return this.next;
	}
	
	//setter for previous
	public void setPrevious(ListElement le) {
		this.previous = le;
	}
	
	//getter for previous
	public ListElement getPrevious () {
		return this.previous;
	}
}