package Employee;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class EmployeeMain {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>();
		Scanner scan;
		Employee employee;
		List<Employee> list;

		char ch;
		try {
			do {
				scan = new Scanner(System.in);
				System.out.println("\nOperations");
				System.out.println("1. Add Employee");
				System.out.println("2. Display by Natural Order");
				System.out.println("3. Display by Name");
				System.out.println("4. Display by Address");
				System.out.println("5. Exit");

				int choice = scan.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter employee id=");
					int empid = scan.nextInt();
					System.out.println("Enter name=");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("Enter Address=");
					String addr = scan.nextLine();
					employee = new Employee(empid, name, addr);

					//adding employee to set
					if (!set.add(employee)) {
						System.out.println("Employee Already Exists");
					} else {
						System.out.println("Employee added");
					}
					break;
					
				case 2:
					System.out.println(set);
					break;
					
				case 3:
					//Creating list of set and sorting using NameComparator class
					list = new LinkedList<Employee>(set);
					Collections.sort(list, new NameComperator());
					System.out.println(list);
					break;
				
				case 4:
					//Creating list of set and sorting using AddressComparator class
					list = new LinkedList<Employee>(set);
					Collections.sort(list, new AddressComparator());
					System.out.println(list);
					break;
				
				case 5:
					System.exit(0);
					break;
				
				default:
					System.out.println("Wrong Entry \n ");
					break;
				}

				System.out.println("\nDo you want to continue (Type y or n) \n");
				ch = scan.next().charAt(0);
			} while (ch == 'Y' || ch == 'y');
		} catch (Exception e) {
			e.getMessage();
			main(args);
		}
	}
}
