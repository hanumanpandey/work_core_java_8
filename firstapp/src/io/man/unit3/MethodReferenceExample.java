package io.man.unit3;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Thread th=new Thread(MethodReferenceExample::printMessage);  //()->printMessage()
		th.start();
	}

	public static void printMessage(){
		System.out.println("Welcome");
	}
}
