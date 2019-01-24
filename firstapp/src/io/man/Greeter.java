package io.man;

public class Greeter {
	public void greet(Greeting greeting){
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
      /*Or*/
		Greeting welcomeGreeting =  new Greeting() {
			@Override
			public void perform() {
				System.out.println("Welcome Greeting");
				
			}
		};
		greeter.greet(welcomeGreeting);
		
		/*from java 8*/
		System.out.println("=========================from java 8===========================");
		Greeting fairWell = ()->{System.out.println("FairWell Greeting");};
		greeter.greet(fairWell);
		
	}
	
	
}
	


