package TreeSort;

import java.util.List;

public class BSTOperations {

	static BinarySearchTree<Integer> createBinarySearchTree(
			BinarySearchTree<Integer> root, int data) {

		if (root == null) {
			root = new BinarySearchTree<Integer>(data);
			root.left = null;
			root.right = null;
			return root;
		} else {
			if (data <= root.getData()) {
				root.left = createBinarySearchTree(root.left, data);
				return root;
			} else {
				root.right = createBinarySearchTree(root.right, data);
				return root;
			}
		}

	}

	static List<Integer> getSortedList(BinarySearchTree<Integer> root,
			List<Integer> list) {
		if (root.getLeftNode() != null) {
			getSortedList(root.left, list);
		}
		list.add(root.data);
		if (root.right != null) {
			getSortedList(root.right, list);
		}
		return list;
	}

}
