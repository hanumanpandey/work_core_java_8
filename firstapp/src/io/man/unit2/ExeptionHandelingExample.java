package io.man.unit2;

import java.util.function.BiConsumer;

public class ExeptionHandelingExample {

	public static void main(String[] args) {
		int[] someNumber={1,2,3,4};
		int key=1;
		process(someNumber,key,wrapperLamda((x,y)->System.out.println(x/y)));
	}

	private static void process(int[] someNumber, int key,BiConsumer<Integer ,Integer > consumer) {
		for(int i:someNumber){
				consumer.accept(i, key);
					
		}
	}
	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> consumer){
		return (x,y)->{
			try {
				//System.out.println("Executing from wrapper");
				consumer.accept(x, y);
			} catch (Exception e) {
				System.out.println("Exception catched.......");
			}
			
			};
	}
	
}
