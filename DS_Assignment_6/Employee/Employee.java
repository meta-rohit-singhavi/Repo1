package Employee;

public class Employee implements Comparable<Employee> {

	private int emp_ID;
	private String name;
	private String address;

	public Employee(int emp_ID, String name, String address) {
		this.emp_ID = emp_ID;
		this.name = name;
		this.address = address;
	}

	public int getEmpID() {
		return this.emp_ID;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}


	/**
	 * Overriding compareTo method and 
	 * Comparing according to employee IDs(Natural Order)
	 */
	@Override
	public int compareTo(Employee o) {
		return this.getEmpID() - o.getEmpID();
	}

	public String toString(){
		String str="";
		
		str+= "emp id="+this.emp_ID+" name= "+this.name+" address= "+this.address+"\n";
		return str;
	}
}
