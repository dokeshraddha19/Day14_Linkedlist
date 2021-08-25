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
			size++;

		}
		public void insertdata(int data){  
	        //Create a new node  
	        Node newNode = new Node(data);  
	          
	        //Checks if the list is empty  
	        if(head == null) {  
	            //If list is empty, both head and tail would point to new node  
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else {  
	            Node temp, current;  
	            //Store the mid position of the list  
	            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
	            //Node temp will point to head  
	            temp = head;  
	            current = null;  
	   
	            //Traverse through the list till the middle of the list is reached  
	            for(int i = 0; i < count; i++) {  
	                //Node current will point to temp  
	                current = temp;  
	                //Node temp will point to node next to it.  
	                temp = temp.next;  
	            }  
	              
	            //current will point to new node  
	            current.next = newNode;  
	            //new node will point to temp  
	            newNode.next = temp;  
	        }  
	        size++;  
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
			list.addNode(56);
			list.addNode(70);
			list.insertdata(30);
			list.display();
		}
	

}
	

	
		
		


