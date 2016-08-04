package SortedLinkList;

public class MyLinkList<T> {

	Node<T> start;
	int size;

	public MyLinkList() {
		start = null;
		size = 0;
	}

	public boolean isEmpty() {
		return start == null;
	}

	public int getSize() {
		return size;
	}

	public Node<T> getHead() {
		return start;
	}

	public void setHead(Node<T> head) {
		start = head;
	}

	/**
	 * This method inserts the input value in the sorted linkedlist using
	 * recursion
	 * @param head
	 * @param value
	 * @return Returns updated head node
	 */
	public Node<T> insert(Node<T> head, T value) {
		if (head == null || (Integer) head.getData() > (Integer) value) {
			Node<T> newNode = new Node<T>();
			newNode.setData(value);
			newNode.setLink(head);
			head = newNode;
			return head;
		} else {
			head.setLink(insert(head.getLink(), value));
			return head;
		}
	}

	/* Function to display LinkedList */
	public void display() {
		System.out.print("Singly Linked List = ");
		Node<T> move = start;
		while (move != null) {
			System.out.println(move.getData());
			move = move.getLink();
		}
	}
}