package io.man.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.man.Person;

public class StreemExample {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
		          new Person("Chandra", "Gupta", 20),
		          new Person("Mahamadya", "Rakshash", 45),
		          new Person("Chanakya", "VishnuGupta", 50),
		          new Person("Mukesh", "Mishra", 50),
		          new Person("Swami", "Chatainya", 50),
		          new Person("Vineeth", "kumar", 22)
		         );
		people.parallelStream()
		.filter(x->x.getFirstName().startsWith("M"))
		.forEach(System.out::println);
		
	}

}
