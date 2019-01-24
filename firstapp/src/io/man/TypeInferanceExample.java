package io.man;

public class TypeInferanceExample {

	public static void main(String[] args) {
		StringLengthLamda myLamda=str->str.length();
		System.out.println(myLamda.getLength("welcome"));
		printlength(s->s.length());
	}
	
	public static void printlength(StringLengthLamda lamda){
		System.out.println(lamda.getLength("welcome"));
	}
	
	interface StringLengthLamda{
		int getLength(String s);
	}

}
