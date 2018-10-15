import java.util.*;

// @Example Implement Reverse of Linked List

//@Example Arrange LinkedList in Odd number followed by Even.

//@author Pranay B

public class LinkedListExample {
	
	static class Node{
		int data;
		Node next;
		
		public  Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	static Node head;

	
	//This method will print LinkedList
	static void printLL(){
		int i = 1 ;
		while(head != null){
			System.out.println("Node number : "+i+" : "+head.data);
			head = head.next;
			i++;
		}
	}
	
	
	//This method will reverse LinkedList
	static Node reverse(Node node){
		Node prev = null;
		Node next = null;
		Node current = node;
		
		System.out.println("REVERSE FUNCTION : "+ current.data );
		System.out.println("REVERSE FUNCTION : "+ head.data );
		while(current != null){ System.out.println("REVERSE FUNCTION");
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = node = prev;
		return head;
		
	}
	
	//This methode will arrange even nodes followed by Odd
	static void evenOdd(){
		System.out.println("EVEN ODD FUNCTION");
	}
	
	public static void main(String args[]){
		
		LinkedListExample ll = new LinkedListExample();
		ll.head = new Node(3);
		ll.head.next = new Node(4);
		ll.head.next.next = new Node(9);
		ll.head.next.next.next = new Node(11);
		ll.head.next.next.next.next = new Node(20);
		System.out.println("From Main Hello World");
		ll.head = ll.reverse(ll.head);
		
		printLL();
		evenOdd();
		printLL();
		
	}
}
