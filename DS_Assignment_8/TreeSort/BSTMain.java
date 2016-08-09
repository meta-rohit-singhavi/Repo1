package TreeSort;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BSTMain {
	static Scanner sc = new Scanner(System.in);
	static BinarySearchTree<Integer> root = null;

	public static void main(String[] args) {
		List<Integer> rollNoList = new LinkedList<Integer>();
		rollNoList = getRollNumbers();
		insertInBST(rollNoList);
		System.out.println("BST of Students Roll Numbers is created");
		System.out.println("Printing InOrder of BST (Tree Sort):");
		List<Integer> sortedList = new LinkedList<Integer>();
		sortedList = BSTOperations.getSortedList(root, sortedList);
		displaySortedList(sortedList);
	}

	static List<Integer> getRollNumbers() {
		List<Integer> rollNoList = new LinkedList<Integer>();
		int n;
		try {
			System.out.println("Enter number of students=");
			n = sc.nextInt();

			System.out.println("Enter roll numbers of all " + n + " Students=");
			for (int i = 0; i < n; i++) {
				rollNoList.add(i, sc.nextInt());
			}
		} catch (Exception e) {
			System.out.println("Enter valid data");
			System.exit(0);
		}
		return rollNoList;
	}

	static void insertInBST(List<Integer> rollNoList) {
		root = new BinarySearchTree<Integer>(rollNoList.get(0));
		for (int i = 1; i < rollNoList.size(); i++) {
			BSTOperations.createBinarySearchTree(root, rollNoList.get(i));
		}
	}

	static void displaySortedList(List<Integer> sortedList) {
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.println(sortedList.get(i));
		}
	}

}
