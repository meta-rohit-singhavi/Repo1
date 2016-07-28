package SinglyLinkedList;

public class Operations {
	
	    Node start;
	    int size ;
	 
	    public Operations(){
	        start = null;
	        size = 0;
	    }
	    
	    public boolean isEmpty(){
	        return start == null;
	    }
	    
	    public int getSize(){
	        return size;
	    }    
	    
	    /**
	     * This method will insert an item at specific location
	     * @param val
	     * @param loc
	     */
	    public void insertAtLoc(int val , int loc){
	        Node nptr = new Node(val, null);                
	        if( loc == 1 && start == null ){
	        	start = nptr;
	        	start.setLink(null);
	        }
	        else if(loc == 1){
	        	nptr.setLink(start);
	        	start= nptr;
	        }
	        else{
	        	Node ptr = start;
		        loc = loc - 1 ;
		        for (int i = 1; i <= size; i++){
		            if(i == loc){
		                Node tmp = ptr.getLink() ;
		                ptr.setLink(nptr);
		                nptr.setLink(tmp);
		                break;
		            }
		            ptr = ptr.getLink();
		        }
	        }
	        ++size ;
	    }
	    
	    public void deleteAtLoc(int location){        
	        if(location == 1) {
	            start = start.getLink();
	            size--; 
	            return ;
	        }
	        if (location == size) {
	            Node current = start;
	            Node temp = start;
	            Node next = current.getLink();
	            while (next != null){
	                temp = current;
	                current = current.getLink();
	                next= next.getLink();
	            }
	            temp.setLink(null);
	            size--;
	            return;
	        }
	        Node ptr = start;
	        location = location - 1 ;
	        for (int i = 1; i < size - 1; i++) {
	            if(i == location) {
	                Node tmp = ptr.getLink();
	                tmp = tmp.getLink();
	                ptr.setLink(tmp);
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	        size-- ;
	    }    
	    
	    public void deleteByValue(int val){
	    	if(start.getData() == val){
	    		if(start.getLink() == null){
	    			start = null;
	    		}else{
		    		start= start.getLink();
	    		}
	    		System.out.println("deleted "+val);
	    		size--;
	    	}
	    	else{
	    		Node nextptr = start;
		    	Node prevptr = new Node();
		    	boolean flag= false;
		    	 for (int i = 1; i <= size ; i++) {
			            if (val == nextptr.getData()){
			                prevptr.setLink(nextptr.getLink());
			                flag= true;
			                break;
			            }
			            prevptr= nextptr;
			            nextptr = nextptr.getLink();
			        }
		    	 if(flag){
		    		 size-- ;
		    		 System.out.println("deleted "+val);
		    	 }
		    	 else
		    		 System.out.println("Value Not Found");	
	    	}
	    }
	    
	    
	    public void getAtLoc(int location){
	    	Node ptr = start;
	       // location = location - 1 ;
	        for (int i = 1; i <= size ; i++){
	            if (i == location) {
	                System.out.println("Value on "+location+" is "+ptr.getData());
	                break;
	            }
	            ptr = ptr.getLink();
	        }
	    }
	    
	    public void reverseLinkedList(){
	    	Node reversedPart = null;
	    	Node current = start;
	    	while (current != null) {
	    	    Node next = current.getLink();
	    	    current.setLink(reversedPart);
	    	    reversedPart = current;
	    	    current = next;
	    	}
	    	start = reversedPart;
	    }
	    
	    public void sortLinkedList(){
	    	if(size == 0){
	    		System.out.println("No elements to sort");
	    	}else{
	    		Node currentNode= start;
		    	Node nextNode= start.getLink();
	    		for(int i= 0; i < size;i++){
		    		while(nextNode != null){
			    		if(currentNode.getData() > nextNode.getData()){
			    			int temp=currentNode.getData();
			    			currentNode.setData(nextNode.getData());
			    			nextNode.setData(temp);
			    		}
			    		
			    		currentNode= nextNode;
			    		nextNode= nextNode.getLink();
			    	}
		    		currentNode= start;
		    		nextNode= start.getLink();
		    	}
	    	}
	    }
	    
	    /*  Function to display LinkedList  */
	    public void display(){
	        System.out.print("Singly Linked List = ");
	        if(size == 0) {
	            System.out.print("empty\n");
	            return;
	        }    
	        if(start.getLink() == null){
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != null){
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
	}