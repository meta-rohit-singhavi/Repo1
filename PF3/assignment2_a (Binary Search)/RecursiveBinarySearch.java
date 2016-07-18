
public class RecursiveBinarySearch {
	
	public int binarySearch(int sortedArray[], int start,int end, int key){
		
		if(start < end){
			int mid= (start + end) / 2;
			if(key < sortedArray[mid]){
				return binarySearch(sortedArray, start, mid, key);
			}else if(key > sortedArray[mid]){
				return binarySearch(sortedArray, mid+1, end, key);
			}else{
				return mid;
			}
		}
		System.out.println("Array does not have the key element "+key);
		return -1;
	}

	
}
