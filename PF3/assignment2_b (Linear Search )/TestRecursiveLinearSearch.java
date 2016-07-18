import static org.junit.Assert.*;

import org.junit.Test;

public class TestRecursiveLinearSearch {

	@Test
	public void testLinearSearch() {
		
		RecursiveLinearSearch linSearch = new RecursiveLinearSearch();
	
		int Array1[]= {2,12,23,25,44,58};
		assertEquals(4, linSearch.linearSearch(Array1, 0, Array1.length, 44));
		
		int Array2[]= {14,16,58,78,89};
		assertEquals(-1, linSearch.linearSearch(Array2, 0, Array2.length, 66));
		
		int Array3[]= {2,12,23,25,44,58};
		assertEquals(0, linSearch.linearSearch(Array3, 0, Array3.length, 2));
	}
}
