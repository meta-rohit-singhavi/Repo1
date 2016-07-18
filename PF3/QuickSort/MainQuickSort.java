package QuickSort;

import java.util.Scanner;

public class MainQuickSort {

	public static void main(String[] args) {
		
		RecursiveQuickSort qSort=new RecursiveQuickSort();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length=");
		int arrLength=sc.nextInt();
		int[] array=new int[arrLength];
		
		System.out.println("Enter array elements=");
		for(int rowNo= 0; rowNo < arrLength; rowNo++){
			array[rowNo]= sc.nextInt();
		}
		array= qSort.getSortedArray(array, 0, arrLength-1);
		
		System.out.println("Sorted array: ");
		for(int row=0;row<arrLength;row++){
			System.out.print(array[row]+" ");
		}
		sc.close();
	}

}
