import static java.lang.System.out;
import java.util.function.Predicate;

class Main {
  public static void main(String[] args) {
    Predicate<String> p1 = str -> {
      out.println("checkLength");
      return str.length() > 3;
    };

    Predicate<String> p2 = str -> {
      out.println("checkEvenLength");
      return str.length() % 2 == 0;
    };

    out.println("or: " + p1.or(p2).test("Sayan"));
    out.println("and: " + p1.and(p2).test("Sayan"));
  }
}
