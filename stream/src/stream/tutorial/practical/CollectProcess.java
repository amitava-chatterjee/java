package stream.tutorial.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectProcess {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(12, 6, 33, -90, 108, 7, 69, 0, -111);
		Stream<Integer> configuredStream = l.stream().filter(e -> (e % 2 == 1) || (e < 0));

		// Process Stream using collect
		List<Integer> al = configuredStream.collect(Collectors.toList());
//		al.add(108);
//		al.remove(0);
		System.out.println(al);
		System.out.println(al.getClass().getName());
	}

}
