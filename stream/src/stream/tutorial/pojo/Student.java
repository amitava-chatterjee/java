package stream.tutorial.pojo;

public class Student {

	public Integer roll;
	public String name;
	public Integer age;

	public Student(Integer roll, String name, Integer age) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student {roll: " + roll + ", name: " + name + ", age: " + age + "}";
	}

}
