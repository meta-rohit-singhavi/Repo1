package sortingsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecursiveQuickSort {

	@Test
	public void testGetSortedArray() {
		int[] arr1={4,8,5,44,55,6};
		int[] expected1={4,5,6,8,44,55};
		assertArrayEquals(expected1, RecursiveQuickSort.getSortedArray(arr1, 0, arr1.length-1));
		
		int[] arr2={-5,6,4,85,7};
		int[] expected2={-5,4,6,7,85};
		assertArrayEquals(expected2, RecursiveQuickSort.getSortedArray(arr2, 0, arr2.length-1));

		int[] arr3={0,-4,-2,8,6,4};
		int[] expected3={-4,-2,0,4,6,8};
		assertArrayEquals(expected3, RecursiveQuickSort.getSortedArray(arr3, 0, arr3.length-1));
	}

}
