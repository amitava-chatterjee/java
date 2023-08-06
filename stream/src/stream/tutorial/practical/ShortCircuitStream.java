package stream.tutorial.practical;

import java.util.Arrays;
import java.util.List;

public class ShortCircuitStream {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(121, 455, 78, 32, 22, 90);
		List<String> names = Arrays.asList("start", "null", "sayan", "harry", "utsav", "last");

		// limit
		nums.stream().sorted().limit(3).forEach(e -> System.out.print(e + " "));
		System.out.println("\n----------------");
		nums.stream().filter(e -> {
			System.out.println("filtering... " + e);
			return e > 50;
		}).limit(3).forEach(e -> System.out.println("At last: " + e));

		// findFirst & findAny
		System.out.println(names.stream().findFirst());
		System.out.println(names.parallelStream().findAny());

		// anyMatch
		System.out.println(names.stream().anyMatch(e -> e == null));
		System.out.println(names.stream().anyMatch(e -> e.equals("foo")));
		System.out.println(names.stream().filter(e -> {
			System.out.println("filter: " + e);
			return e.length() >= 2;
		}).anyMatch(e -> e.equals("null")));

		// allMatch
		System.out.println(names.stream().filter(e -> {
			System.out.println("filtering... " + e);
			return e.length() >= 2;
		}).allMatch(e -> e.equals("new")));

		// noneMatch
		System.out.println(names.stream().filter(e -> {
			System.out.println("filter: " + e);
			return e.length() >= 2;
		}).noneMatch(e -> e.equals("start")));
	}

}
