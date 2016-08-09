package TreeSort;

public class BinarySearchTree<T> {
	T data;
	BinarySearchTree<T> left, right;

	BinarySearchTree(){
		this.left=null;
		this.right=null;
	}
	BinarySearchTree(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	void setLeftNode(BinarySearchTree<T> bt) {
		this.left = bt;
	}

	void setRightNode(BinarySearchTree<T> bt) {
		this.right = bt;
	}

	BinarySearchTree<T> getLeftNode() {
		return this.left;
	}

	BinarySearchTree<T> getRightNode() {
		return this.right;
	}

	void setData(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}

}
