package Synchronization;

public class TicketBooking implements Runnable {
	private static int availableTickets = 1;

	@Override
	public synchronized void run() {
//		if (availableTickets != 0) {
//			book();
//		} else {
//			System.out.println(Thread.currentThread().getName() + " didn't get the ticket");
//		}
		book();
	}

	public void book() {
//		System.out.println(Thread.currentThread().getName() + " got the ticket");
//		availableTickets--;
		System.out.println(Thread.currentThread().getName() + " Entered");
		if (availableTickets != 0) {
			// availableTickets--;
			System.out.println(Thread.currentThread().getName() + " got the ticket");
			availableTickets--;

		} else {
			System.out.println(Thread.currentThread().getName() + " didn't get the ticket");
		}
	}

}
