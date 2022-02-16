package Day3;

public class ListOfUsers {
	static User[] u = { new User(1, "Vineeth", 25), new User(2, "Raj", 27), new User(3, "Ronith", 21) };
	static int count = 0;

	public static void searchUser(int id) throws UserNotFound {
		for (User u1 : u) {
			if (id == u1.getuID()) {
				System.out.println(u1.getName() + ", " + u1.getAge() + ", " + u1.getuID());
				break;
			} else
				count++;

		}
		if (count == u.length) {
			throw new UserNotFound();
		}

	}
}
