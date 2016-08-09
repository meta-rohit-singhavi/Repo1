package sortingsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRadixSort {

	@Test
	public void testRadixSort() {
		int[] arr1={4,8,5,44,55,6};
		int[] expected1={4,5,6,8,44,55};
		assertArrayEquals(expected1, RadixSort.radixSort(arr1, 2));
		
		int[] arr2={5,6,4,855,77};
		int[] expected2={4,5,6,77,855};
		assertArrayEquals(expected2, RadixSort.radixSort(arr2, 3));
	}

}
