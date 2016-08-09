package sortingsystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountingSort {

	@Test
	public void test() {
		int[] arr1={4,8,5,44,55,6};
		int[] expected1={4,5,6,8,44,55};
		assertArrayEquals(expected1, CountingSort.countingSort(arr1, 55));
		
		int[] arr2={5,6,4,855,77};
		int[] expected2={4,5,6,77,855};
		assertArrayEquals(expected2, CountingSort.countingSort(arr2, 855));
	}

}
