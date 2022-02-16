package ThreadsImplementation;

public class TestDaemon {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Demo(), "A");
		Thread t2 = new Thread(new Demo(), "B");
		Thread t3 = new Thread(new Demo(), "C");
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}
}
