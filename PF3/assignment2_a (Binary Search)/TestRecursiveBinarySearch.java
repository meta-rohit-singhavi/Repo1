import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author RDX
 *
 */
public class TestRecursiveBinarySearch {

	@Test
	public void testBinarySearch() {
		RecursiveBinarySearch binSearch = new RecursiveBinarySearch();
		
		int ascendingArray1[]= {2,12,23,25,44,58};
		assertEquals(4, binSearch.binarySearch(ascendingArray1, 0, ascendingArray1.length, 44));
		
		int ascendingArray2[]= {14,16,58,78,89};
		assertEquals(-1, binSearch.binarySearch(ascendingArray2, 0, ascendingArray2.length, 66));
		
		int ascendingArray3[]= {2,12,23,25,44,58};
		assertEquals(0, binSearch.binarySearch(ascendingArray3, 0, ascendingArray3.length, 2));

	}
}