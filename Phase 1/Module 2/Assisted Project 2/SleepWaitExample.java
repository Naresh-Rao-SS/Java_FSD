package phase1module2;

public class SleepWaitExample {
	public static void main(String[] args) {
		// Using sleep()
		try {
			System.out.println("Before sleep output");
			System.out.println("");
			Thread.sleep(5000); // Sleep for 1 second
			
			System.out.println("After sleep output");
			System.out.println("");
		} 
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Using wait() and notify()
		Object lockobj = new Object();
		Thread thread1obj = new Thread(() -> {
			synchronized (lockobj) {
				System.out.println("Thread 1: Waiting");
				System.out.println("");
				
				try {
					lockobj.wait(); // Wait indefinitely
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1: Resumed");
				System.out.println("");
			}
		});

		Thread thread2obj = new Thread(() -> {
			synchronized (lockobj) {
				try {
					Thread.sleep(5000);
					System.out.println("Main Thread: Notifying");
					System.out.println("");
					lockobj.notify(); // Notify the waiting thread
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		thread1obj.start();
		thread2obj.start();
	}
}
