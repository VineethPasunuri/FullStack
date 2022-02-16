package ThreadsImplementation;

public class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " is Entered");
		display();

	}

	public void display() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("Thread " + Thread.currentThread().getName() + " is Executing for loop " + i);
		}
	}
}
