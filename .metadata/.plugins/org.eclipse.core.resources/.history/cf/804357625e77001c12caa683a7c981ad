package Day4;

import java.util.Scanner;

public class TestEmployeeStorage {

	public static void main(String[] args) {
		EmployeeStorage es1 = new EmployeeStorageImplementation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option");
		int temp;
		do {
			System.out.println("select the required Option");
			System.out.println("1. Store" + "\n" + "2.findEmployee" + "\n" + "3.find List of Employees" + "\n"
					+ "4. Delete Employee Record" + "\n" + "5. Exit");
			int option = sc.nextInt();
			temp = option;
			switch (option) {
			case 1:
				System.out.println("Enter Employee id");
				int eId = sc.nextInt();
				System.out.println("Enter Employee Name");
				String eName = sc.next();
				System.out.println("Enter Employee salary");
				double sal = sc.nextDouble();
				Employee e1 = new Employee(eId, eName, sal);
				System.out.println(es1.save(e1));
				break;
			case 2:
				System.out.println("Enter Employee Id to search");
				int id = sc.nextInt();

				try {
					System.out.println(es1.findEmployee(id));
					// es1.findEmployee(id);
				} catch (EmployeeNotFound e) {
					// TODO Auto-generated catch block
					System.out.println("User with id=" + id + "is not Existing");
					e.printStackTrace();
				}
				break;
			case 3:
				Employee[] e11 = new Employee[es1.findEmployees().length];
				for (int i = 0; i < e11.length; i++) {
					e11[i] = es1.findEmployees()[i];
				}
				for (int i = 0; i < e11.length; i++) {
					System.out.println(e11[i]);
				}

				break;
			case 4:
				System.out.println("Enter Employee id to delete the record");
				int eid = sc.nextInt();
				try {
					es1.delete(eid);
				} catch (EmployeeNotFound e) {
					e.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Exited");
				break;
			default:
				System.out.println("You entered a wrong option");

			}
		} while (temp != 5);
	}

}
