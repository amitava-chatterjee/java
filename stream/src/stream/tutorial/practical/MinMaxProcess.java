package stream.tutorial.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxProcess {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12, 6, 33, -90, 108, 7, 69, 0, -111);
		Stream<Integer> configuredStreamForMin = l.stream().filter(e -> (e % 2 == 1) || (e < 0));
		Stream<Integer> configuredStreamForMax = l.stream().filter(e -> (e % 2 == 1) || (e < 0));

		// Process Stream using min & max
		Integer min = configuredStreamForMin.min((o1, o2) -> o1.compareTo(o2)).get();
		Integer max = configuredStreamForMax.max((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("min: " + min);
		System.out.println("max: " + max);

		List<String> list = Arrays.asList("sa", "fa", "bar", "foo");
		Stream.of(list, list).forEach(System.out::print);
	}

}
