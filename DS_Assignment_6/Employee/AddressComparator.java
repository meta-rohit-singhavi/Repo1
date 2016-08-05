package Employee;

import java.util.Comparator;

public class AddressComparator implements Comparator<Employee> {
	
	/**
	 * Overriding compare method and 
	 * Comparing according to employee Address
	 */
	public int compare(Employee o1, Employee o2) {
		return o1.getAddress().compareToIgnoreCase(o2.getAddress());
	}
}
