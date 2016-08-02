package preorder_postorder_MirrorImage;

public class MirrorImage {

	static boolean checkMirror(BinaryTree bt1, BinaryTree bt2) {

		if (bt1 == null && bt2 == null) {
			return true;
		} else {
			return (bt1.getData() == bt2.getData()
					&& checkMirror(bt1.left, bt2.right) && checkMirror(
						bt1.right, bt2.left));
		}

	}
}
