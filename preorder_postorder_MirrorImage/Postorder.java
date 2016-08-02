package preorder_postorder_MirrorImage;

public class Postorder {

	static void printPostorder(BinaryTree root) {
		if (root != null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.println(root.getData());
		}
	}
}
