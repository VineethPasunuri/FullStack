package ThreadsImplementation;

public class ThreadCreation implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable Interface implemented with thread :" + Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadCreation(), "A");
		Thread t2 = new Thread(new ThreadCreation(), "B");
		Thread t3 = new Thread(new ThreadCreation(), "C");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main Thread execution ends");

	}

}
