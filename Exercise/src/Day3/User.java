package Day3;

public class User {
	private int uID;
	private String name;
	private int age;

	public User(int uID, String name, int age) {
		super();
		this.uID = uID;
		this.name = name;
		this.age = age;
	}

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public User() {
//		super();
//	}

	@Override
	public String toString() {
		return "User [uID=" + uID + ", name=" + name + ", age=" + age + "]";
	}
}

