package BinarySearchLeftOccurrence;

public class BinarySearchLeftOccurrence {
	

	/*
	 * binarySearchMethod is recursive method for searching element
	 * 
	 * @arr[] is searching array
	 * 
	 * @target is value we have to be search
	 * 
	 * @first & @last is variable for tracking
	 */
	public int binarySearchMethod(int arr[], int first, int last, int target) {System.out.println("hii");
		int mid = (first + last) / 2;
		if (first > last) { // target not found condition
			return -1;
		} else if (target < arr[mid]) {
			return binarySearchMethod(arr, first, mid - 1, target);
		} else if (target > arr[mid]) {
			return binarySearchMethod(arr, mid + 1, last, target);
		} else {
			mid = checkLeftOccurrence(arr, mid);
			return mid; // target found condition
		}
	} // End of binaryFunction

	public int checkLeftOccurrence(int arr[], int mid) {
		int leftPlace = mid;

		for (int index = mid - 1; index >= 0; index--) {
			if (arr[index] == arr[mid]) {
				leftPlace = index;
			}
		}

		return leftPlace;
	}

}
