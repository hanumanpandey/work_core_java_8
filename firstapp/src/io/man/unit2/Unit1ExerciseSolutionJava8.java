package io.man.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import io.man.Person;
public class Unit1ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
				          new Person("Chandra", "Gupta", 20),
				          new Person("Mahamadya", "Rakshash", 45),
				          new Person("Chanakya", "VishnuGupta", 50),
				          new Person("Mukesh", "Mishra", 50),
				          new Person("Swami", "Chatainya", 50),
				          new Person("Vineeth", "kumar", 22)
				         );
		
		//To do 1: sort list by last name
		Collections.sort(people,(o1, o2)-> o1.getLastName().toLowerCase().compareTo(o2.getLastName().toLowerCase()));
		//To do 2: create method that prints all element of list
		performConditionally(people, person->true);
		//To do 3: create method that prints the people have last name start with C.
		 System.out.println("====the people have last name start with C===");
		 
		 performConditionally(people, person-> person.getLastName().startsWith("C"));					
		//To do 3: create method that prints the people have first name start with C.
		 System.out.println("====the people have first name start with M===");
		 
		 performConditionally(people, person-> person.getFirstName().startsWith("M"));
	}

	private static void performConditionally(List<Person> people, Predicate<Person> condition) {
		for(Person person:people){
			if(condition.test(person))
			System.out.println(person.toString());
		}
	}
}

