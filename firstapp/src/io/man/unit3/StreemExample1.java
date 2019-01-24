package io.man.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.man.Person;

public class StreemExample1 {

	public static void main(String[] args) {
		List<Person> people= Arrays.asList(
		          new Person("Chandra", "Gupta", 20),
		          new Person("Mahamadya", "Rakshash", 45),
		          new Person("Chanakya", "VishnuGupta", 50),
		          new Person("Mukesh", "Mishra", 50),
		          new Person("Swami", "Chatainya", 50),
		          new Person("Vineeth", "kumar", 22)
		         );
		people.stream()
		.filter(p->p.getFirstName().startsWith("M"))
		.forEach(System.out::println);
		
		
		long count=people.stream().filter(s->s.getLastName().startsWith("C")).count();
		System.out.println(count);
		
	}

}
