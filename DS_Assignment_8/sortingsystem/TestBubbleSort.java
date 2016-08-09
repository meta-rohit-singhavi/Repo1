package sortingsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBubbleSort {

	@Test
	public void test() {
		int[] arr1={4,8,5,44,55,6};
		int[] expected1={4,5,6,8,44,55};
		assertArrayEquals(expected1, BubbleSort.bubbleSort(arr1));
		
		int[] arr2={-5,6,4,85,7};
		int[] expected2={-5,4,6,7,85};
		assertArrayEquals(expected2, BubbleSort.bubbleSort(arr2));

		int[] arr3={0,-4,-2,8,6,4};
		int[] expected3={-4,-2,0,4,6,8};
		assertArrayEquals(expected3, BubbleSort.bubbleSort(arr3));
	}

}
