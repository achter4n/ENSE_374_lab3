package lab3;

import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();		//linked list
		int userInput;							//user input for switch statement
		int data;								//data input
		int index;								//index input
		Scanner in = new Scanner(System.in);	//console input scanner
		
		System.out.println("Enter a '1' to add a node, a '2' to delete a node, a '3' to print the list from the head, a '4' to print the list from the tail, or any other key to end the program.");
		userInput = in.nextInt();
		
		//while the userInput variable equals one of the options
		while(userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4) {
			switch (userInput) {
			case 1:								//add new element
				System.out.println("Enter the data to add: ");
				data = in.nextInt();
				ListElement le = new ListElement();
				le.setData(data);
				list.addElement(le);
				break;
			case 2:								//delete element by index
				System.out.println("Enter the index of the data to delete: ");
				index = in.nextInt();
				list.deleteElement(index);
				break;
			case 3:								//print list from head
				list.printLinkedListHead();
				break;
			case 4:
				list.printLinkedListTail();		//print list from the tail
				break;
			}
			
			System.out.println("Enter a '1' to add a node, a '2' to delete a node, a '3' to print the listfrom the head, a '4' to print the list from the tail, or any other key to end the program.");
			userInput = in.nextInt();
		}
	}
}
