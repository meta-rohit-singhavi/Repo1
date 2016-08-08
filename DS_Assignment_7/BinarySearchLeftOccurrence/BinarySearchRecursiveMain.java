package BinarySearchLeftOccurrence;

import java.util.Scanner;

public class BinarySearchRecursiveMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size=");
		int size=scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Elements=");
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter target=");
		int target =scan.nextInt();
		System.out.println(new BinarySearchLeftOccurrence().binarySearchMethod(arr,0,arr.length-1, target));
	}
}
