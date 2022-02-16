package Day4;

public interface EmployeeStorage {
	public int save(Employee e);

	public Employee findEmployee(int id) throws EmployeeNotFound;

	public Employee[] findEmployees();

	public void delete(int id) throws EmployeeNotFound;

}
