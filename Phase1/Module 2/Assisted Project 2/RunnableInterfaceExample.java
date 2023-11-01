package phase1module2;

//1. Creating a Thread by Extending 'Thread' Class
class MyThread extends Thread {

	public void run() {
		System.out.println("Thread using Thread class");
	}
}

//1. Creating a Thread by Implementing 'Runnable' Interface
class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Thread using Runnable interface");
	}
}

public class RunnableInterfaceExample {
	public static void main(String[] args) {
		// Using 'Thread' class
		MyThread threadobj = new MyThread();
		threadobj.start();

		// Using 'Runnable' interface
		Thread runnableThreadobj = new Thread(new MyRunnable());
		runnableThreadobj.start();
	}
}
