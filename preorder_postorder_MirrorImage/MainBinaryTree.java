package preorder_postorder_MirrorImage;

import java.util.Scanner;

public class MainBinaryTree {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String choice = "";
		BinaryTree root = null;
		do {
			try {
				root = BinaryTree.createBinaryTree(root, getInputData());
				System.out.println("Type Y to enter more items");
				choice = sc.next();
			} catch (Exception e) {
				System.out.println("Wrong choice");
				System.exit(0);
			}

		} while (choice.equalsIgnoreCase("y"));

		System.out.println("PreOrder Of tree is:");
		Preorder.printPreorder(root);
		System.out.println("\nPostorder of tree is:");
		Postorder.printPostorder(root);

		if (MirrorImage.checkMirror(root, BinaryTree.getBinaryTree())) {
			System.out
					.println("Entered tree is a Mirror image of predefined tree");
		} else {
			System.out
					.println("Entered tree is not a Mirror image of predefined tree");
		}
		sc.close();
	}

	static int getInputData() {
		int data = 0;
		try {
			System.out.println("Enter data=");
			data = Integer.parseInt(sc.next());
		} catch (Exception e) {
			System.out.println("Enter valid data");
			getInputData();
		}
		return data;
	}

}
