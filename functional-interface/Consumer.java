import static java.lang.System.out;
import java.util.function.Consumer;

class Person {
  String name;
}

class Main {
  public static void main(String[] args) {
    Person person = new Person();
    Consumer<Person> c = p -> p.name = "Play Java";
    out.println("Before consumer: " + person.name);
    c.accept(person);
    out.println("After consumer: " + person.name);
  }
}
