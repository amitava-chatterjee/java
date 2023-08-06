import static java.lang.System.out;
import java.util.function.Function;

class Main {
  public static void main(String[] args) {
    // Function<T, R> f; // where T is type and R is return type
    Function<Integer, String> f = i -> "Argument is " + i;
    out.println(f.apply(24));
    f = (Integer i) -> "Argument is " + i;
    out.println(f.apply(27));
  }
}
