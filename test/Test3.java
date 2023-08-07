import static java.lang.System.out;
import java.util.function.Function;

class Main {
  public static void main(String[] args) {
    Function<Integer, Integer> f1 = e -> e * 3;
    Function<Integer, ?> f2 = e -> "String test " + e;
    Function<Long, String> f3 = e -> {
      return "Long: " + e;
    };

    out.println(f1.apply(43));
    out.println(f2.apply(43));
    out.println(f3.apply(1L));
    out.println(Function.identity().apply("self"));
    // out.println(Function.<String>identity().apply(3)); this is an error

    Function<String, Long> f4 = e -> Long.parseLong(e);
    Function<Long, Integer> f5 = e -> {
      e -= (e - 10);
      return e.intValue();
    };

    out.println(f4.andThen(f5).apply("8981702261"));
  }
}
