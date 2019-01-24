package io.man;

public class RunnableLamdaExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			public void run() {
				System.out.println("By Anonymous...");
			}
		});
		myThread.start();
		/*using Lamda expressions.......*/
		Runnable rnb=()->System.out.println("by Lamda...");
		Thread lamdaThread = new Thread(rnb);
		 lamdaThread.start();
	}

}
