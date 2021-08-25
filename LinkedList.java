package datastructure;

public class LinkedList{
	//create node which has two attributes: data and next,next is a pointer to the next node.
	class Node{
		int data;
		Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
		}
	}
	
	//create haed and tail

	public Node head=null;
	public Node tail=null;

	//addNode() will add new node to the list
	public void appendNode(int data){
		// create new node
		Node newNode=new Node (data);
		//checks if the list is empty
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		else{
			tail.next=newNode;
			tail=newNode;
		}


	}
	//display() will display all the nodes in the list
	void display(){
		Node current=head;
		if(head==null){
			System.out.print("List is Empty");
		}
		while(current != null){
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		LinkedList list=new LinkedList();
		list.appendNode(70);
		list.appendNode(30);
		list.appendNode(56);
		list.display();
	}
	

}
	

	
		
		


