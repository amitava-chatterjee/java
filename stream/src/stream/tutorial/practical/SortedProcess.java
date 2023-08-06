package stream.tutorial.practical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedProcess {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12, 6, 33, -90, 108, 7, 69, 0, -111);
		Stream<Integer> configuredStream = l.stream().filter(e -> (e % 2 == 1) || (e < 0));

		// Process Stream using sorted
		Comparator<Integer> comparator = (o1, o2) -> o2.compareTo(o1);
//		configuredStream.sorted().forEach(e -> System.out.print(e + " "));
		configuredStream.sorted(comparator).forEach(e -> System.out.print(e + " "));
	}

}
