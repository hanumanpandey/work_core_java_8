package io.man.unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.man.Person;

public class MethodReferanceExample2 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				          new Person("Chandra", "Gupta", 20),
				          new Person("Mahamadya", "Rakshash", 45),
				          new Person("Chanakya", "VishnuGupta", 50),
				          new Person("Mukesh", "Mishra", 50),
				          new Person("Swami", "Chatainya", 50),
				          new Person("Vineeth", "kumar", 22)
				         );
		
		//To do 2: create method that prints all element of list
		 printPeopleConditionally(people, person->true, System.out::println);// x->System.out.println(x);
		}

	private static void printPeopleConditionally(List<Person> people, Predicate<Person> condition,Consumer<Person> consumer) {
		for(Person person:people){
			if(condition.test(person))
			 consumer.accept(person);
		}
	}
}