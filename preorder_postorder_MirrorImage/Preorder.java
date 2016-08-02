package preorder_postorder_MirrorImage;

public class Preorder {

	static void printPreorder(BinaryTree root) {
		if (root != null) {
			System.out.println(root.getData());
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

}
