package datastructure;

public class ILinkedList {
	class Node{
		int data;
		Node next;
	public Node (int data){
		this.data=data;
		this.next=null;
		}
	}
	
	//create haed and tail
	public int size;
	public Node head=null;
	public Node tail=null;

	//addNode() will add new node to the list
	public void addNode(int data){
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
     public void deleteFromStart() {  
  
        //Checks if the list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks whether the list contains only one node  
            //If not, the head will point to next node in the list and tail will point to the new head.  
            if(head != tail) {  
                head = head.next;  
            }  
            //If the list contains only one node  
            //then, it will remove it and both head and tail will point to null  
            else {  
                head = tail = null;  
            }  
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
		ILinkedList ilist=new ILinkedList();
		ilist.addNode(56);
		ilist.addNode(30);
		ilist.addNode(70);
		ilist.display();

 
            		ilist.deleteFromStart();  
            //Printing updated list  
           		 System.out.println("Updated List: ");  
            		ilist.display();  
         
	}

}
