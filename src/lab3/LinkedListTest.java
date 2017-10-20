package lab3;

import java.util.Scanner;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int userInput;
		int data;
		int index;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a '1' to add a node, a '2' to delete a node, a '3' to print the list from the head, a '4' to print the list from the tail, or any other key to end the program.");
		userInput = in.nextInt();
		
		while(userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4) {
			switch (userInput) {
			case 1:
				System.out.println("Enter the data to add: ");
				data = in.nextInt();
				ListElement le = new ListElement();
				le.setData(data);
				list.addElement(le);
				break;
			case 2:
				System.out.println("Enter the index of the data to delete: ");
				index = in.nextInt();
				list.deleteElement(index);
				break;
			case 3:
				list.printLinkedListHead();
				break;
			case 4:
				list.printLinkedListTail();
				break;
			}
			
			System.out.println("Enter a '1' to add a node, a '2' to delete a node, a '3' to print the listfrom the head, a '4' to print the list from the tail, or any other key to end the program.");
			userInput = in.nextInt();
		}
	}
}
