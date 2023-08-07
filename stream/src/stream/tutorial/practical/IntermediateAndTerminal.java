package stream.tutorial.practical;

import java.util.Arrays;
import java.util.List;

import stream.tutorial.pojo.Employee;

public class IntermediateAndTerminal {

	public static void main(String[] args) {
		Employee sayan = new Employee(1, "sayan");
		Employee santam = new Employee(2, "santam");
		Employee kushal = new Employee(3, "kushal");
		Employee utsav = new Employee(4, "utsav");
		Employee anuska = new Employee(5, "anuska");
		Employee sirsha = new Employee(6, "sirsha");

		List<Employee> employees = Arrays.asList(sayan, santam, kushal, utsav, anuska, sirsha);

//		employees.stream().filter(e -> {
//			System.out.println("Inside function: " + e);
//			return e.name.length() == 5;
//		}).forEach(e -> System.out.println("At last: " + e));

		employees.stream().filter(e -> {
			System.out.println("filter: " + e);
			return e.name.length() == 5;
		}).map(e -> {
			System.out.println("map: " + e);
			return e.name;
		}).forEach(e -> System.out.println("At last: " + e));
	}

}
