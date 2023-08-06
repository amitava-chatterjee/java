import java.util.function.Consumer;
import static java.lang.System.out;

class Person {
  String email;
  String phone;

  @Override
  public String toString() {
    return "{email: " + email + ", phone: " + phone + "}";
  }
}

class Main {
  public static void main(String[] args) {
    Person person = new Person();
    Consumer<Person> c1 = p -> p.email = "sayan@gmail.com";
    Consumer<Person> c2 = p -> p.phone = "8981702261";
    out.println(person);
    c1.accept(person);
    out.println(person);
    c2.accept(person);
    out.println(person);

    Person person2 = new Person();
    Consumer<Person> cc1 = p -> {
      out.println("email");
      p.email = "sayan@gmail.com";
    };

    Consumer<Person> cc2 = p -> {
      out.println("phone");
      p.phone = "8981702261";
    };

    out.println("person2: " + person2);
    cc2.andThen(cc1).accept(person2);
    out.println("person2: " + person2);
  }
}
