package preorder_postorder_MirrorImage;

public class BinaryTree {

	int data;
	BinaryTree left, right;

	BinaryTree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	void setLeftNode(BinaryTree bt) {
		this.left = bt;
	}

	void setRightNode(BinaryTree bt) {
		this.right = bt;
	}

	BinaryTree getLeftNode() {
		return this.left;
	}

	BinaryTree getRightNode() {
		return this.right;
	}

	int getData() {
		return data;
	}

	/**
	 * This method creates a binary tree according to passed data
	 * 
	 * @param root
	 * @param data
	 * @return It will return updated tree
	 */
	static BinaryTree createBinaryTree(BinaryTree root, int data) {
		if (root == null)
			root = new BinaryTree(data);
		else if (root.left == null)
			root.left = new BinaryTree(data);
		else if (root.right == null)
			root.right = new BinaryTree(data);
		else if (root.left != null)
			createBinaryTree(root.left, data);
		else if (root.right != null)
			createBinaryTree(root.right, data);
		else
			System.out.println("else");

		return root;
	}

	/**
	 * It will create binary tree with predefined values
	 * 
	 * @return Returns Created tree
	 */
	static BinaryTree getBinaryTree() {
		BinaryTree root = new BinaryTree(10);
		BinaryTree bt2 = new BinaryTree(20);
		BinaryTree bt3 = new BinaryTree(30);
		BinaryTree bt4 = new BinaryTree(40);
		BinaryTree bt5 = new BinaryTree(50);
		BinaryTree bt6 = new BinaryTree(60);
		BinaryTree bt7 = new BinaryTree(70);

		root.setLeftNode(bt3);
		root.setRightNode(bt2);
		bt2.setLeftNode(bt5);
		bt2.setRightNode(bt4);
		bt4.setLeftNode(bt7);
		bt4.setRightNode(bt6);

		return root;
	}

}
