package Day4;

public class DaoFactory {
	public static EmployeeStorage getInstance() {
		return new EmployeeStorageImplementation();

	}
}
