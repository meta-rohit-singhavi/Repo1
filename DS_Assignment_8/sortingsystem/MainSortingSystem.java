package sortingsystem;

import java.util.Scanner;

public class MainSortingSystem {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			System.out.println("Enter array length=");
			int arrLength = scan.nextInt();
			int[] array = new int[arrLength];
			int[] sortedArray = new int[arrLength];
			System.out.println("Enter array elements=");
			for (int rowNo = 0; rowNo < arrLength; rowNo++) {
				array[rowNo] = scan.nextInt();
			}

			String operation[] = new String[] { "Comparison Sort",
					"Linear Sort", "Exit" };
			int counter = 0;
			System.out.println("Select any type of Sorting -------");
			for (String opt : operation) {
				System.out.println(++counter + "." + opt);
			}
			int choice = getChoice(counter);
			switch (choice) {
			case 1:
				if (arrLength <= 10) {
					System.out.println("Applying Bubble Sort");
					sortedArray = BubbleSort.bubbleSort(array);
				} else {
					System.out.println("Applying Quick Sort");
					sortedArray = RecursiveQuickSort.getSortedArray(array, 0,
							arrLength - 1);
				}
				displaySortedArray(sortedArray);
				break;
			case 2:
				if (getDigitCount(maximumNumber(array)) > 2) {
					System.out.println("Applying Radix Sort");
					sortedArray = RadixSort.radixSort(array,
							getDigitCount(maximumNumber(array)));
				} else {
					System.out.println("Applying Counting Sort");
					sortedArray = CountingSort.countingSort(array,
							maximumNumber(array));
				}
				displaySortedArray(sortedArray);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter correct choice");
				main(args);
				break;
			}
		} catch (Exception e) {
			System.out.println("Enter valid data");
		}

	}

	// finds largest element in array
	public static int maximumNumber(int array[]) {
		int temp = array[0];

		for (int index = 1; index < array.length; index++) {
			if (temp < array[index]) {
				temp = array[index];
			}
		}
		return temp;
	}

	// count digit of maximum element in array
	public static int getDigitCount(int max) {
		int count = 0;
		while (max != 0) {
			count++;
			max = max / 10;
		}
		return count;
	}

	// it takes users choice and return it
	static int getChoice(int range) {
		int choice = 0;
		try {
			do {
				choice = Integer.parseInt(scan.next());
			} while (choice <= 0 || choice > range);
		} catch (Exception e) {
			System.out.println("Invalid choice");
			getChoice(range);
		}
		return choice;
	}

	static void displaySortedArray(int[] sortedArray) {
		System.out.println("Sorted array is=");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

}
