package MyStack;

public class MyNode<T> {
	T data;
	MyNode<T> next;
	
	public MyNode() {
		// TODO Auto-generated constructor stub
		data= null;
		next= null;
	}
	
	public MyNode(T data , MyNode<T> next){
		this.data=data;
		this.next=next;
	}
	
	public void setData(T data){
		this.data=data;
	}
	
	public T getData(){
		return this.data;
	}
	
	public void setNext(MyNode<T> next){
		this.next = next;
	}
	
	public MyNode<T> getNext(){
		return next;
	}
}
