package MyQueue;

import java.util.Scanner;

import MyStack.InToPost;
import MyStack.MyStack;

public class MyQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);   
		MyQueue myQueue= new MyQueue();
		
        char ch; 
        try{
        	do 
	        {
	            System.out.println("\nQueue Operations");
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Make Empty");
	            System.out.println("4. Get Front");
	            System.out.println("5. Get Queue size");   
	            System.out.println("6. Display Queue");
	            
	            int choice = scan.nextInt();
	            switch (choice) {
	            case 1 :
	                System.out.println("Enter element to queue=");
	                 myQueue.enqueue(Integer.parseInt(scan.next()));
	                break;                         
	            case 2 : 
	            	System.out.println("Dequeue = "+ myQueue.dequeue());   
	                break;                         
	            case 3 : 
	            	myQueue.makeEmpty();
	                System.out.println("Queue is Empty");
	                break;                         
	            case 4 : 
	                System.out.println("Front Element is="+ myQueue.getFront());
	                break;                
	            case 5 : 
	                System.out.println("Queue Size = "+ myQueue.size()); 
	                break;   
	            case 6:
		            System.out.println(myQueue);   break;         
	            default: 
	                System.out.println("Wrong Entry \n ");
	                break;
	            }        
	            /* display queue */    
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);       
	        } while (ch == 'Y'|| ch == 'y');          
        }
        catch(Exception e){
        	e.getMessage();
        	main(args);
        }
        scan.close();
	}
	}


