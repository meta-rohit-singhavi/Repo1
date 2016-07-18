
public class RecursiveLinearSearch {

	public int linearSearch(int[] array, int currentPosition, int arrLength, int key){
		if(array[currentPosition] == key){
			return currentPosition;
		}else if(currentPosition < arrLength-1){
			return linearSearch(array, currentPosition+1, arrLength, key);
		}else{
			System.out.println("Could not found the key element "+key);
			return -1;
		}
	}
}
