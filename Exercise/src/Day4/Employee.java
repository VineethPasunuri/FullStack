package Day4;

public class Employee {
	private int eID;
	private String name;
	private double salary;

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int eID, String name, double salary) {
		super();
		this.eID = eID;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", name=" + name + ", salary=" + salary + "]";
	}

}
