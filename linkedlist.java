  
//program to implement singly linked list in java

class SinglyLinkedList{
	class Node{					//particular node of linkedlist
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data){
		Node newNode = new Node(data);
		
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void deleteNode(int pos){
		Node temp=head;
		for(int i=1;i<pos;i++){
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	public void display(){
		if(head==null){
			System.out.println("LinkedList is empty");
		}
		else{
			Node temp = head;
			System.out.println("Linked List elements are: ");
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		SinglyLinkedList list = new SinglyLinkedList();
		
		System.out.println("Entering 5 elements is LinkedList");
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		System.out.println("The 5 List elements are...");
		list.display();
		System.out.println("List are deleting element at index 2");
		list.deleteNode(2);
		list.display();
	}
	
	
}