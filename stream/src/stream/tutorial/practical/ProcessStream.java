package stream.tutorial.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProcessStream {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12, 4, 7, 889, -12, 90, 0, 11, -27, 69);

		// 1. Create Stream object
		Stream<Integer> stream = l.stream();

		// 2. Configuration of Stream object using (filter, map)
		stream = stream.filter(e -> e >= 0);
		stream = stream.map(e -> e * 2);

		// 3. Processing of the configuration aka terminal
		stream.forEach(e -> System.out.print(e + " "));
		System.out.println();
//		stream.forEach(System.out::println);

		// stream processing in one line
		l.stream().filter(e -> e >= 0).map(e -> e * 2).forEach(e -> System.out.print(e + " "));
//		l.stream().filter(e -> e >= 0).map(e -> e * 2).forEach(System.out::print);
		System.out.println();
	}

}
