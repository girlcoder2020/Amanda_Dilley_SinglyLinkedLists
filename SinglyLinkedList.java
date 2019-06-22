
public class SinglyLinkedList {
	    public Node head;
	    public SinglyLinkedList() {
	        head = null;
	    	// your code here
	    }
	    // SLL methods go here. As a starter, we will show you how to add a node to the list.
	    public void add(int value) {
	        Node newNode = new Node(value);
	        if(head == null) {
	            head = newNode;
	        } 
	        else {
	            Node runner = head;
	            while(runner.next != null) {
	                runner = runner.next;
	            }
	            runner.next = newNode;
	        }
	    } 
	    
//	    to remove nodes
	    
    	Node trailingRunner;
        Node runner;
        public void remove() {

    		runner = head;

	    	while (runner.next != null){
	            trailingRunner = runner;
	            runner = runner.next;
	            }
	    	trailingRunner.next = null;
	        }
	    
//	    to print values
	    public void printValues() {
	    	Node slList = head;
	    	while (slList != null) {
	    		System.out.println(slList.value);
	    		slList = slList.next;
	    	}
	    }
	}

