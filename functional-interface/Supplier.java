import static java.lang.System.out;
import java.util.function.Supplier;

class Main {
  public static void main(String[] args) {
    Supplier<Double> s = () -> Math.random();
    out.println(s.get());
  }
}
