package stream.tutorial.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import stream.tutorial.pojo.Person;

public class MapAndFlatMap {

	static List<Person> persons = new ArrayList<>();

	static {
		persons.add(new Person(1, "Sayan", Arrays.asList("Pune", "Bangalore", "Noida")));
		persons.add(new Person(2, "Utsav", Arrays.asList("Pune", "Chennai", "Noida")));
		persons.add(new Person(3, "Ridhhi", Arrays.asList("Kolkata", "Noida")));
		persons.add(new Person(4, "Santam", Arrays.asList("Bangalore", "Gujarat")));
	}

	public static void main(String[] args) {
		persons.stream().map(e -> e.places).forEach(System.out::print);
		System.out.println();
		List<String> places = persons.stream().flatMap(e -> e.places.stream()).collect(Collectors.toList());
		Set<String> uniquePlaces = persons.stream().flatMap(e -> e.places.stream()).collect(Collectors.toSet());
		System.out.println(places);
		System.out.println(uniquePlaces);
		uniquePlaces.stream().sorted().forEach(System.out::println);
	}

}
