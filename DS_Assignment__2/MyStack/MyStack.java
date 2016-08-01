package MyStack;

import java.util.NoSuchElementException;

public class MyStack<T> {

	MyNode<T> head;
	int size;
	
	public MyStack() {
		// TODO Auto-generated constructor stub
		head=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public int size(){
		return size;
	}
	
	public void push(T data){
		MyNode<T> newNode= new MyNode<T>(data , null);
		
		if(head==null){
			head=newNode;
		}
		else{
			newNode.setNext(head);
			head=newNode;
		}
		size++;
	}
	
	public T pop(){
		if(isEmpty()){
			throw new NoSuchElementException("Underflow Exception") ;
		}
			MyNode<T> temp=head;
			head=temp.getNext();
			size--;	
			return temp.getData();
	}
	
	public T peek(){
		if(isEmpty()){
			throw new NoSuchElementException("Underflow Exception") ;
		}
		return head.getData();
	}
	
	public void display(){
		System.out.print("\nStack = ");
		if(isEmpty()){
			System.out.println("No Element");
			return;
		}
		MyNode<T> temp= head;
		
		while(temp != null){
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println();
	}
}
