package stream.tutorial.practical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkipProcess {

	public static void main(String[] args) {
		// Find out the 2nd highest or 2nd lowest from a list
//		List<Integer> l = Arrays.asList(12, 543, 65, 1, 23, 6787, 23, 34);
		List<Integer> l = new ArrayList<>(Arrays.asList(12, 543, 65, 1, 23, 678, 23, 34));
		System.out.println(l.getClass());

		// 2nd highest
		int max2nd = l.stream().sorted((o1, o2) -> o2.compareTo(o1)).skip(1).limit(1).toList().get(0);
		System.out.println("2nd highest: " + max2nd);

		// 2nd lowest
		int min2nd = l.stream().sorted().skip(1).limit(1).toList().get(0);
		System.out.println("2nd lowest: " + min2nd);
	}

}
