package datastructure;

public class SinglyLinkedList {
	SinglyLinkedListNode head;
	SinglyLinkedListNode tail;
	public SinglyLinkedList(){
		this.head=null;
		this.tail=null;
	}
	void insertNode(int data) {
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		if(this.head==null) {
			this.head=node;
		}else {
			this.tail.next=node;
		}
		
	}
	void printList(SinglyLinkedListNode head) {
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
}
