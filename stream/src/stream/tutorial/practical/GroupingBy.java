package stream.tutorial.practical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import stream.tutorial.pojo.Student;

public class GroupingBy {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(1, "santam", 12), new Student(2, "kutus", 12),
				new Student(3, "sayan", 14), new Student(4, "rishi", 13), new Student(5, "sayan", 13),
				new Student(6, "debjit", 12));

		Function<Student, Integer> function = e -> e.age;
		var smartResult = students.stream().collect(Collectors.groupingBy(function));
		Map<Integer, List<Student>> result = students.stream().collect(Collectors.groupingBy(function));
		System.out.println(result);
		System.out.println(smartResult);
		System.out.println(smartResult.getClass());
	}

}
