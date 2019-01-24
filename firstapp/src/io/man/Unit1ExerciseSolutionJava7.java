package io.man;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

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
		Collections.sort(people,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().toLowerCase().compareTo(o2.getLastName().toLowerCase());
			}
		});
		//To do 2: create method that prints all element of list
		 printAll(people);
		//To do 3: create method that prints the people have last name start with C.
		 System.out.println("====the people have last name start with C===");
		 
		printPeopleConditionally(people,new Condtion() {
			
			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("C");
			}
		});
		//To do 3: create method that prints the people have first name start with C.
		 System.out.println("====the people have first name start with M===");
		 
		printPeopleConditionally(people,new Condtion() {
			
			@Override
			public boolean test(Person person) {
				return person.getFirstName().startsWith("M");
			}
		});
	}

	private static void printPeopleConditionally(List<Person> people, Condtion condition) {
		for(Person person:people){
			if(condition.test(person))
			System.out.println(person.toString());
		}
	}

	private static void printAll(List<Person> people) {
		for(Person person:people){
			System.out.println(person.toString());
		}
	}

}
interface Condtion{
	boolean test(Person person);
}
