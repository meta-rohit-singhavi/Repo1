import java.util.Scanner;

public class MainBinarySearch {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int key, arraySize;
		System.out.println("Enter no. of elements=");
		
		arraySize= sc.nextInt();
		if(arraySize > 0){
		int[] array= new int[arraySize];
		
		System.out.println("Now Enter Elements: ");
		for(int i=0; i < arraySize; i++){
			array[i]= sc.nextInt();
		}
	
		System.out.println("Element to search=");
		key= sc.nextInt();
		System.out.println("index = "+new RecursiveBinarySearch().binarySearch(array, 0, array.length, key));
		sc.close();
		}else{
			System.out.println("Enter correct array Size");
			sc.close();
		}
	}
}
