package stackandqueue;

public class StackusingLinkedList {
	private class Node {
		 
        int data; 
        Node link; 
    }
    
    Node top;
    
    StackusingLinkedList()
    {
        this.top = null;
    }
 
    // Utility function to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();
 
        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
 
        
        temp.data = x;
 
        
        temp.link = top;
 
        
        top = temp;
    }
 
   
    public boolean isEmpty()
    {
        return top == null;
    }
 
    
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
 
    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
 
        // update the top pointer to point to the next node
        top = (top).link;
    }
 
    public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                // print node data
                System.out.printf("%d->", temp.data);
 
                // assign temp link to temp
                temp = temp.link;
            }
        }
    }
    public static void main(String[] args)
    {
        // create Object of Implementing class
        StackusingLinkedList list = new StackusingLinkedList();
        // insert Stack value
        list.push(70);
        list.push(30);
        list.push(56);
        
     // print Stack elements
        list.display();
        while(list.top!=null) {
        	list.pop();
        	list.display();
        }
        list.peek();
        list.display();
 
        
    }
}


