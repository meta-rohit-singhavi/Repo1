package Employee;

import java.util.Comparator;

public class NameComperator implements Comparator<Employee> {

	/**
	 * Overriding compare method and 
	 * Comparing according to employee names
	 */
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
