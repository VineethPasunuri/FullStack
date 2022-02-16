package Synchronization;

public class TestTicketBooking {

	public static void main(String[] args) {
		Thread t1 = new Thread(new TicketBooking(), "A");
		Thread t2 = new Thread(new TicketBooking(), "B");
		Thread t3 = new Thread(new TicketBooking(), "C");
		t1.start();
		t2.start();
		t3.start();

	}

}
