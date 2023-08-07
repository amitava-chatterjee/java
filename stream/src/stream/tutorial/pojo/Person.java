package stream.tutorial.pojo;

import java.util.List;

public class Person {

	public Integer id;
	public String name;
	public List<String> places;

	public Person(Integer id, String name, List<String> places) {
		super();
		this.id = id;
		this.name = name;
		this.places = places;
	}

	@Override
	public String toString() {
		return "Person {id: " + id + ", name: " + name + ", places: " + places + "}";
	}

}
