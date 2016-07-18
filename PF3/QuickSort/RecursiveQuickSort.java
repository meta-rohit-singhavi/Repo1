package QuickSort;

public class RecursiveQuickSort {
	/**
	 * This method implements quick sort algorithm
	 * @param array Integer array to be sorted
	 * @param first First position of array
	 * @param last Last position of array
	 * @return It returns integer sorted array
	 */
	public int[] getSortedArray(int array[], int first, int last){
		if(first > last){
			return array;
		}
		int pi= partition(array, first, last);
		getSortedArray(array, first, pi-1);
		getSortedArray(array, pi+1, last);
		return array;
	}
	
	/**
	 * This method divides the array
	 * @param arr An array of integers
	 * @param first First position of array
	 * @param last Last position of array
	 * @return It return the index of the pivot element
	 */
	public int partition(int arr[], int first, int last){
		
		int pivot= arr[last];
		int index= first - 1;
		int temp;
		for(int rowCount= first; rowCount <= last; rowCount++){
			if(arr[rowCount] < pivot){
				index++;
				temp= arr[index];
				arr[index]= arr[rowCount];
				arr[rowCount]= temp;
			}
		}
		temp= arr[index + 1];
		arr[index + 1]= arr[last];
		arr[last]= temp;
		return (index + 1);
	}
}