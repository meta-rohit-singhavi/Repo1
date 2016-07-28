package BinarySearchRecursive;



class BinarySearch{
	
	/*binarySearchMethod is recursive method for searching element
	 * @arr[] is seraching array
	 * @target is value we have to be search
	 * @first & @last is variable for tracking
	 * */
	public int binarySearchMethod(int arr[],int first,int last,int target){
		int mid=(first+last)/2; 	//to find midean position of array
		if(first>last){				//target not found condition
			return -1;
		}
		else if(target<arr[mid]){		//when target is lesser then a[mid]
			return binarySearchMethod(arr, first, mid-1, target);
		}
		else if(target>arr[mid]){		//when target is greater then a[mid]
			return binarySearchMethod(arr, mid+1, last, target);
		}
		else{
			return mid;		//target found condition
		}
	} //End of binaryFunction
	
	
}

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=scan.nextInt();
		}
		int target =scan.nextInt();*/
		System.out.println(new BinarySearch().binarySearchMethod(new int[]{1,2,3,4,5},0,5,4));
	}

}
