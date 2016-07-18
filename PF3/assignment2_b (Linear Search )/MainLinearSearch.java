import java.util.Scanner;

public class MainLinearSearch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int searchingElement, arraySize;
		System.out.println("Enter no. of elements=");
		arraySize= sc.nextInt();
		
		if(arraySize > 0){
			int[] array= new int[arraySize];
			System.out.println("Now Enter Elements one by one: ");
				for(int i=0; i < arraySize; i++){
					array[i]= sc.nextInt();
				}	
			System.out.println("Element to search=");
			searchingElement= sc.nextInt();
			System.out.println("index= "+new RecursiveLinearSearch().linearSearch(array, 0, array.length, searchingElement));
			sc.close();
		}else{
			System.out.println("Enter correct array size");
			sc.close();
		}
	}
}