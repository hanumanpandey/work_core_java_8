package io.man.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import io.man.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				          new Person("Chandra", "Gupta", 20),
				          new Person("Mahamadya", "Rakshash", 45),
				          new Person("Chanakya", "VishnuGupta", 50),
				          new Person("Mukesh", "Mishra", 50),
				          new Person("Swami", "Chatainya", 50),
				          new Person("Vineeth", "kumar", 22)
				         );
		
		System.out.println("using for loop ");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
		System.out.println("using for in loop ");
		for(Person person:people){
			System.out.println(person);
		}
		System.out.println("using foreach");
		people.forEach(System.out::println);//x->System.out.println(x)
	
	}
}
