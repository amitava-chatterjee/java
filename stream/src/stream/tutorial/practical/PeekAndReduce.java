package stream.tutorial.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PeekAndReduce {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(23, -44, 67, 1, -9, 0, -108, 69, 111);
//		System.out.println(nums);

		Stream<Integer> stream = nums.stream().filter(e -> e >= 0).map(e -> e / 2).filter(e -> e % 2 == 1)
				.sorted((o1, o2) -> o2.compareTo(o1));
		stream.forEach(e -> System.out.print(e + " "));

		// reduce
		Integer sum = Stream.of(1, 2, 3, 4, 5).reduce((o1, o2) -> o1 + o2).get();
		Integer mul = Stream.of(1, 2, 3, 4, 5).reduce(2, (o1, o2) -> o1 * o2);
		System.out.println("\nsum is " + sum);
		System.out.println("mul is " + mul);
	}

}
