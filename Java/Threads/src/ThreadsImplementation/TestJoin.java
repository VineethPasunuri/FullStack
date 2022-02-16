package ThreadsImplementation;

public class TestJoin {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Demo(), "A");
		Thread t2 = new Thread(new Demo(), "B");
		Thread t3 = new Thread(new Demo(), "C");
		t1.start();
		try {
			t1.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();

	}

}
