import static java.lang.System.out;
import java.util.function.Function;

class Main {
  public static void main(String[] args) {
    // Function<T, R> f; // where T is type and R is return type
    // Function<Long, Long> doubleIt = i -> i * 2;
    // Function<Long, Long> cubeIt = i -> i * i * i;

    Function<Long, Integer> doubleIt = i -> new Long(i * 2).intValue();
    Function<Integer, Long> cubeIt = i -> i * i * i * 1L;

    out.println(cubeIt.andThen(doubleIt).apply(3));
    out.println(cubeIt.compose(doubleIt).apply(3L));
  }
}
