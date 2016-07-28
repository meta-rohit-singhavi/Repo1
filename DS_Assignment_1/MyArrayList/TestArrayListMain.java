package MyArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrayListMain {
	
	@Test
	public void testReverse() {
		MyArrayList myList= new MyArrayList();
		myList.add(11);
		myList.add(55);
		myList.add(4);
		
		MyArrayList expected= new MyArrayList();
		expected.add(4);
		expected.add(55);
		expected.add(11);
		assertArrayEquals(expected.getObjectArray(), myList.reverse().getObjectArray());
	}
	
	@Test
	public void testSort(){
		MyArrayList myList= new MyArrayList();
		myList.add(12);
		myList.add(5);
		myList.add(24);
		
		MyArrayList expected= new MyArrayList();
		expected.add(5);
		expected.add(12);
		expected.add(24);
		assertArrayEquals(expected.getObjectArray(), myList.sort().getObjectArray());
	}
}
