import static java.lang.System.out;
import java.util.function.Predicate;

@FunctionalInterface
interface MyPredicate<T> {
  boolean test(T t);
}

class Main {
  public static void main(String[] args) {
    Predicate<String> p = str -> str.length() > 3;
    out.println(p.test("Sayan"));
    MyPredicate<String> mp = str -> str.length() > 3;
    out.println(mp.test("Sad"));
  }
}
