import java.util.*;
class CustomLinkedList 
{
	static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
	public static void main(String[] args) 
	{
		CustomLinkedList list = new CustomLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

		list.printList(head);
		head = list.ReverseLinkedList(head);
		System.out.println();
		System.out.println("Reverse a linked List");
		list.printList(head);
	}

	static void printList(Node head){
		Node temp = head;
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

	Node ReverseLinkedList(Node head){
		
		Node curr = head;
		Node prev = null;
		Node next = null;

		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;

	}
}

